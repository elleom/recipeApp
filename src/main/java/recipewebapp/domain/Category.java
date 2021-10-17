package recipewebapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * @author el_le
 * @since 18/09/2021 17:25
 */
@Data
@Entity
public class Category {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}
