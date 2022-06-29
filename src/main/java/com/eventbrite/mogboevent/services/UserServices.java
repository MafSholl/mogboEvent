package com.eventbrite.mogboevent.services;

import com.eventbrite.mogboevent.dto.requests.LoginUserRequest;
import com.eventbrite.mogboevent.dto.requests.RegisterUserRequest;
import com.eventbrite.mogboevent.dto.responses.LoginUserResponse;
import com.eventbrite.mogboevent.dto.responses.RegisterUserResponse;
import com.eventbrite.mogboevent.exceptions.NoUserException;

public interface UserServices {

    RegisterUserResponse registerUser (RegisterUserRequest request);
    LoginUserResponse loginUser (LoginUserRequest request) throws NoUserException;
}
