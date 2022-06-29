package com.eventbrite.mogboevent.dto.responses;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginUserResponse {

    private String id;
    private String firstName;
    private String lastName;
    private String email;

}
