package recipewebapp.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import recipewebapp.commands.IngredientCommand;
import recipewebapp.converters.IngredientToIngredientCommand;
import recipewebapp.domain.Recipe;
import recipewebapp.repositories.RecipeRepository;

import java.util.Optional;

/**
 * @author el_le
 * @since 10/11/2021 23:15
 */
@Slf4j
@Service
public class IngredientServiceImpl implements IngredientService {
    private final RecipeRepository recipeRepository;
    private final IngredientToIngredientCommand ingredientToIngredientCommand;

    public IngredientServiceImpl(RecipeRepository recipeRepository, IngredientToIngredientCommand ingredientToIngredientCommand) {
        this.recipeRepository = recipeRepository;
        this.ingredientToIngredientCommand = ingredientToIngredientCommand;
    }

    @Override
    public IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(recipeId);

        if (!recipeOptional.isPresent()) {
            //impl error handling
            log.error("recipe nor found - id: " + recipeId);
        }
        Recipe recipe = recipeOptional.get();
        Optional<IngredientCommand> ingredientCommandOptional = recipe.getIngredients().stream()
                .filter(ingredient -> ingredient.getId().equals(ingredientId))
                .map(ingredient -> ingredientToIngredientCommand.convert(ingredient)).findFirst();
        if (!ingredientCommandOptional.isPresent()){
            //todo add handling ex
            log.error("Ingredient with id "+ingredientId +" is not found: ");
        }
        return ingredientCommandOptional.get();
    }
}
