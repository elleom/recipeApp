package recipewebapp.service;

import org.springframework.stereotype.Service;
import recipewebapp.domain.Recipe;
import recipewebapp.repositories.RecipesRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * @author el_le
 * @since 02/10/2021 23:01
 */

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipesRepository recipesRepository;

    public RecipeServiceImpl(RecipesRepository recipesRepository) {
        this.recipesRepository = recipesRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipesRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
