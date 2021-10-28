package recipewebapp.service;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import recipewebapp.domain.Recipe;
import recipewebapp.repositories.RecipeRepository;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * @author el_le
 * @since 24/10/2021 14:21
 */

class RecipeServiceImplTest {

    RecipeService recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    public void getRecipes() throws Exception{
        Recipe recipe = new Recipe();
        Set<Recipe> recipesData = recipeService.getRecipes();
        recipesData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipesData);

        assertEquals(recipesData.size(), 1);
        verify(recipeRepository, times(0));
    }

}