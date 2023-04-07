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
public class BikeController {

    @Autowired
    UserService userService;

    @Autowired
    BikeService bikeService;

 
    
    




}
