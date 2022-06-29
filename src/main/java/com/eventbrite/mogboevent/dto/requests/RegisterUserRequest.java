package com.eventbrite.mogboevent.dto.requests;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
//@RequiredArgsConstructor
public class RegisterUserRequest {
    private String id;
    private String email;
    private String firstName;
    private String lastName;
    private String password;
}
