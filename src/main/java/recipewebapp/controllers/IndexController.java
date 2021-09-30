package recipewebapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import recipewebapp.repositories.CategoryRepository;
import recipewebapp.repositories.UnitOfMeasureRepository;

/***
 *
 */
@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    @Autowired // self wired when constructor bases injection
    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "index"}) //see notation , refers to multiple entries
    public String getIndexPage(){
        return "index";
    }
}
