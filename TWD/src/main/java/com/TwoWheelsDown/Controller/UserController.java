package com.TwoWheelsDown.Controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.TwoWheelsDown.Entity.User;
import com.TwoWheelsDown.Service.UserService;

@Controller

public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String home(HttpSession session, Model model) {

        String email = (String) session.getAttribute("emailCookie");
        if(email != null) {

            User loggedInUser = userService.findUserByEmail(email);

            model.addAttribute("user", loggedInUser);

        }
        return "home";
    }

    
    @GetMapping("/sign-up")
    public String signUp(Model model) {
        
        model.addAttribute("user", new User());

        return "signUp";
    }

    @PostMapping("/sign-up")
    public String signUp(@ModelAttribute("user") User user, HttpSession session) {

        User loggedInUser = userService.signUp(user);

        session.setAttribute("emailCookie", loggedInUser.getEmail());

        return "redirect:";

    }

    @GetMapping("/sign-in")
    public String signIn(Model model) {

        model.addAttribute("user", new User());

        return "signIn";
    }

    @PostMapping("/sign-in")
    public String signIn(@ModelAttribute("user") User user, Model model, HttpSession session) {

        try {

            User loggedInUser = userService.signIn(user);

            session.setAttribute("emailCookie", loggedInUser.getEmail());

            if(loggedInUser.getIsAdmin() == true) {
                return "redirect:admin-tool";
            }
            
            return "redirect:";

        } catch(Exception e) {

            return "signIn";

        }

    }

    @GetMapping(value="/logout")
    public String logOut(HttpSession session) {

        session.removeAttribute("emailCookie");

        return "redirect:";

    }



}
