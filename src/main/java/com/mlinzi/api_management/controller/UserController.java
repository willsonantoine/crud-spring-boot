package com.mlinzi.api_management.controller;

import com.mlinzi.api_management.models.Users;
import com.mlinzi.api_management.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/create")
    public Users create(@RequestBody Users poUser){
        return userService.crreer(poUser);
    }

    @GetMapping("/read")
    public List<Users> read(){
        return userService.lire();
    }

    @PutMapping("/update/{id}")
    public Users update(@PathVariable String id,@RequestBody Users users){
        return userService.modifier(id,users);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable String id){
        return userService.supprimer(id);
    }
}
