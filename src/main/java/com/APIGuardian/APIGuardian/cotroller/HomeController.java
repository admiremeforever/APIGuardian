package com.APIGuardian.APIGuardian.cotroller;


import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.APIGuardian.APIGuardian.model.User;
import com.APIGuardian.APIGuardian.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userService;
   
	//api -> http://localhost:8080/home/user
   @GetMapping("/user")
    public List<User> getUser() {
	   System.out.println(userService.getUsers());

        return userService.getUsers();
    }
   
 //api -> http://localhost:8080/home/current-user
   @GetMapping("/current-user")
   public String getLogedInUser(Principal principal) {
	   

       return principal.getName();
   }
   
   


}