package recipewebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import recipewebapp.domain.Recipe;

/**
 * @author el_le
 * @since 19/09/2021 22:26
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
