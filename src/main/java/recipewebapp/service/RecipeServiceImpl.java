package recipewebapp.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import recipewebapp.domain.Recipe;
import recipewebapp.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * @author el_le
 * @since 02/10/2021 23:01
 */

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("Loading recipes ");
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
