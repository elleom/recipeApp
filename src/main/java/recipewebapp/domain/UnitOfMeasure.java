package recipewebapp.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @author el_le
 * @since 18/09/2021 16:34
 */

@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}
