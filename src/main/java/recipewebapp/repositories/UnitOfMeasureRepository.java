package recipewebapp.repositories;

import org.springframework.data.repository.CrudRepository;
import recipewebapp.domain.UnitOfMeasure;

import java.util.Optional;

/**
 * @author el_le
 * @since 19/09/2021 22:28
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
