package org.launchcode.cheesemvc00.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cheese")
public class CheeseController {

    @RequestMapping(value="")

    public String index(Model model) {

        model.addAttribute("title", "My Cheeses");
        return "cheese/index";
    }
}
