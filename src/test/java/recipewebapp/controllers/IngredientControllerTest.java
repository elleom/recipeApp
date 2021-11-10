package recipewebapp.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import recipewebapp.commands.IngredientCommand;
import recipewebapp.commands.RecipeCommand;
import recipewebapp.domain.Recipe;
import recipewebapp.service.RecipeService;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author el_le
 * @since 10/11/2021 21:14
 */
class IngredientControllerTest {

    @Mock
    RecipeService recipeService;

    IngredientController controller;
    MockMvc mockMvc;

    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        controller = new IngredientController(recipeService);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    void showIngredientsTest() throws Exception {
        //given
        RecipeCommand command = new RecipeCommand();
        when(recipeService.findCommandById(anyLong())).thenReturn(command);
        //when
        mockMvc.perform(get("/recipe/1/ingredients")).andExpect(status().isOk())
                .andExpect(view().name("recipe/ingredient/list"))
                .andExpect(model().attributeExists("recipe"));
        //then
        verify(recipeService, times(1)).findCommandById(anyLong());
    }

    @Test
    void viewIngredient() throws Exception {
        //given
        RecipeCommand command = new RecipeCommand();
        when(recipeService.findCommandById(anyLong())).thenReturn(command);
        //when
        mockMvc.perform(get("/recipe/1/ingredients/1/show")).andExpect(status().isOk())
                .andExpect(view().name("recipe/ingredient/show"))
                .andExpect(model().attributeExists("ingredient"));
        //then
        verify(recipeService, times(1)).findCommandById(anyLong());


    }
}