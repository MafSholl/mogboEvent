package com.eventbrite.mogboevent.controllers;

import com.eventbrite.mogboevent.dto.requests.LoginUserRequest;
import com.eventbrite.mogboevent.dto.requests.RegisterUserRequest;
import com.eventbrite.mogboevent.dto.responses.LoginUserResponse;
import com.eventbrite.mogboevent.dto.responses.RegisterUserResponse;
import com.eventbrite.mogboevent.exceptions.NoUserException;
import com.eventbrite.mogboevent.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserServices userServices;

    @PostMapping("/user")
    public RegisterUserResponse register(@RequestBody RegisterUserRequest registerUserRequest){
        return userServices.registerUser(registerUserRequest);
    }

    @GetMapping("/user/{email}")
    public LoginUserResponse login(@PathVariable LoginUserRequest loginUserRequest) throws NoUserException {
        return userServices.loginUser(loginUserRequest);
    }
}
