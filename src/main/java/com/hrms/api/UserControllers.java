package com.hrms.api;

import com.hrms.business.abstracts.UserService;
import com.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserControllers {

    private UserService userService;
    @Autowired
    public UserControllers(UserService userService) {
        super();
        this.userService = userService;
    }
    @GetMapping("/getall")
    public List<User> getAll(){
        return userService.getAll();
    }

}
