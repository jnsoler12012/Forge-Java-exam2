package com.nicolas.examen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nicolas.examen.models.User;
import com.nicolas.examen.services.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
    @Autowired UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGet(){
        return "login";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost(
        @RequestParam("email") String email,
        @RequestParam("password") String password,
        HttpSession session,
        Model model
    ){
        User user = userService.findByEmail(email, password);

        if(user != null){
            session.setAttribute("persona_id", user.getId());
        } else{
            model.addAttribute("errorAuth", "Invalid email or password");
        }
        return "redirect:/";
    }
    
}
