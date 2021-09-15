package com.lm.recipewebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 *
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "index"}) //see notation , refers to multiple entries
    public String getIndexPage(){
        return "index";
    }
}
