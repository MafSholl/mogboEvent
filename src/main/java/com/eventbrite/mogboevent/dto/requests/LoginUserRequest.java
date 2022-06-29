package com.eventbrite.mogboevent.dto.requests;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginUserRequest {

    private String email;
    private String password;
}
