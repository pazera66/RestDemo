package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * Created by karol on 25.07.16.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {


    @RequestMapping(value = "index", method = RequestMethod.GET)
    String displayIndex(){
        return "Displaying simple message";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    String displayUsername(){
        return "Name of the user is: ";// + name;
    }


//    @RequestMapping(value = "/user", method = RequestMethod.POST)
//    public void createUser(@RequestBody User user){
//        System.out.println(user);
//    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public User createUser2(@RequestHeader(value = "fname", required = true) String fname, @RequestHeader(defaultValue = "lname") String lname){
        User user = new User(fname, lname);
        //System.out.println(user);
        return user;
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    List<User> getUsersList(){
        return Arrays.asList(new User("Karol", "Krol"), new User("Michal", "Kowalski"));
    }


}
