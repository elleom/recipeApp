package recipewebapp.service;

import org.springframework.stereotype.Service;
import recipewebapp.commands.IngredientCommand;

/**
 * @author el_le
 * @since 10/11/2021 23:13
 */
@Service
public interface IngredientService {
    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
