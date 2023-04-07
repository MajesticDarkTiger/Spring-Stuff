package com.TwoWheelsDown.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.TwoWheelsDown.Entity.User;
import com.TwoWheelsDown.Service.BikeService;
import com.TwoWheelsDown.Service.UserService;

@Controller
public class AdminController {

    @Autowired
    UserService userService;

    @Autowired
    BikeService bikeService;

    @GetMapping("/admin-tool")
    public String adminToolHome(Model model, HttpSession session) {
        String email = (String) session.getAttribute("emailCookie");
        if(email != null) {

            User loggedInUser = userService.findUserByEmail(email);
            model.addAttribute("user", loggedInUser);
            if(loggedInUser.getIsAdmin() != true) {
                return "redirect:";
            }
            return "adminTool";
        }
        return "redirect:";
    }

    @GetMapping("/create-bikes")
    public String createBikes(Model model, HttpSession session) {

        String email = (String) session.getAttribute("emailCookie");
        if(email != null) {

            User loggedInUser = userService.findUserByEmail(email);
            model.addAttribute("user", loggedInUser);
            if(loggedInUser.getIsAdmin() != true) {
                return "redirect:";
            }

            return "adminBikes";

        }

        return "redirect:";
    }

}
