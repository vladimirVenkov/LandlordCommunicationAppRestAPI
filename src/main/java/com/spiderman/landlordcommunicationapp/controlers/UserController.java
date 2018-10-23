package com.spiderman.landlordcommunicationapp.controlers;

import com.spiderman.landlordcommunicationapp.models.User;
import com.spiderman.landlordcommunicationapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Users")
@PreAuthorize("isAnonymous()")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/byId/{userId}")
    public User getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    @GetMapping("/tenants")
    public List<User> getAllTenants() {
        return userService.getAllUsersWhoAreTenants();
    }

    @GetMapping("/landlords")
    public List<User> getAllLandlords() {
        return userService.getAllUsersWhoAreLandlords();
    }

    @PostMapping("/new")
    public User saveUser(@RequestBody User user) {
        return userService.save(user);
    }
}
