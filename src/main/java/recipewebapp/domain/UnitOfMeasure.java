package recipewebapp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author el_le
 * @since 18/09/2021 16:34
 */
@Entity
public class UnitOfMeasure {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String uom) {
        this.description = uom;
    }
}
