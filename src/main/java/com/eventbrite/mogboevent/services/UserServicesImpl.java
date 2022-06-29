package com.eventbrite.mogboevent.services;

import com.eventbrite.mogboevent.data.models.User;
import com.eventbrite.mogboevent.data.repositories.UserRepository;
import com.eventbrite.mogboevent.dto.requests.LoginUserRequest;
import com.eventbrite.mogboevent.dto.requests.RegisterUserRequest;
import com.eventbrite.mogboevent.dto.responses.LoginUserResponse;
import com.eventbrite.mogboevent.dto.responses.RegisterUserResponse;
import com.eventbrite.mogboevent.exceptions.NoUserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.Optional;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    private UserRepository userRepository;

    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest request){
        User user = new User();
        user.setEmail(request.getEmail());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setPassword(request.getPassword());

        User savedUser = userRepository.save(user);

        RegisterUserResponse response = new RegisterUserResponse();
        response.setEmail(savedUser.getEmail());
        response.setDateCreated(DateTimeFormatter.ofPattern("EEEE, dd/MM/yyy, hh:mm, a").format(savedUser.getDateRegistered()));
        return response;
    }

    @Override
    public LoginUserResponse loginUser(LoginUserRequest request) throws NoUserException {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        String email = user.getEmail();
        String password = user.getPassword();

        Optional<User> userInDatabase = userRepository.findByEmail(request.getEmail());
        LoginUserResponse response = new LoginUserResponse();
        if (userInDatabase.isEmpty()) throw new NoUserException("User does not exist!");
        else {
            User optionalUser = userInDatabase.get();
            response.setId(optionalUser.getId());
            response.setFirstName(optionalUser.getFirstName());
            response.setLastName(optionalUser.getLastName());
            response.setEmail(optionalUser.getEmail());
        }
        return response;
    }
}
