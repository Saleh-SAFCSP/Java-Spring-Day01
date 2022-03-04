package com.example.test123.controllers;

import com.example.test123.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {


    ArrayList <User> usersList=new ArrayList<>();

    @GetMapping("user")
    public ArrayList<User> getUsers(){
        return usersList;
    }


    @PostMapping("user")
    public ArrayList<User> addUser(@RequestBody User user){
        System.out.println("Hey from POST user");
        usersList.add(user);
        return usersList;
    }


    @PutMapping("user/{id}")
    public ArrayList<User> updateUser(@PathVariable int index,@RequestBody User user){
        usersList.set(index,user);
        return usersList;
    }


    @DeleteMapping("user/{id}")
    public ArrayList<User> deleteUser(@PathVariable int index){
        usersList.remove(index);
        return usersList;
    }


}
