package com.billal.jokes.controllers;

/*
 * Created by Billal Taha
 * User: BILLALT
 * Date: 4/15/2019
 * Time: 3:31 PM
 */

import com.billal.jokes.services.JokeSrvice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeSrvice jokeSrvice;


    public JokeController(JokeSrvice jokeSrvice) {
        this.jokeSrvice = jokeSrvice;
    }

    @RequestMapping({"/","jokes"})
    public String showJoke(Model model){
        model.addAttribute("joke" , jokeSrvice.getJoke());
        return "chucknorris";
    }
}
