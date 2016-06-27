package com.egfavre.controllers;

import com.egfavre.UserRepository;
import com.egfavre.entitites.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by user on 6/27/16.
 */
@RestController
public class RegController {
    @Autowired
    UserRepository users;

    @RequestMapping (path="/user", method = RequestMethod.GET)
    public Iterable<User> getUsers(){
        return users.findAll();
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        users.save(user);
    }

    @RequestMapping(path = "/user", method = RequestMethod.PUT)
    public void editUser(@RequestBody User user){
        users.save(user);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") int id){
        users.delete(id);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id){
        return users.findOne(id);
    }
}
