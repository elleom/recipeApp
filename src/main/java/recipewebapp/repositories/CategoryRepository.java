package recipewebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import recipewebapp.domain.Category;

/**
 * @author el_le
 * @since 19/09/2021 22:27
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
