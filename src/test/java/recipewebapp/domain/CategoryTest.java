package recipewebapp.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author el_le
 * @since 24/10/2021 13:59
 */
public class CategoryTest {

    static Category category;

    @BeforeAll
    public static void setUp(){
        category = new Category();
    }

    @Test
    public void getId() throws Exception {
        Long idValue = 4L;

        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getDescription() throws Exception {

    }

    @Test

    public void getRecipes() throws Exception {

    }
}
