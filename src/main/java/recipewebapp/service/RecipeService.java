package recipewebapp.service;

import recipewebapp.domain.Recipe;

import java.util.Set;

/**
 * @author el_le
 * @since 02/10/2021 22:59
 */

public interface RecipeService {

    Set<Recipe> getRecipes();
}