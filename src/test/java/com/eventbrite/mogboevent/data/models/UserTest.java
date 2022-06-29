package com.eventbrite.mogboevent.data.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    private User user;

    @BeforeEach
    public void setUp(){
        user = new User();
    }

    @Test
    public void userMethodsWorksTest(){
        user.setId("1");
        user.setEmail("ajibadeadebola@gmail.com");
        user.setFirstName("Adebola");
        user.setLastName("Ajibade");
        user.setPassword("adebola2020");

        assertEquals("1", user.getId());
        assertEquals("ajibadeadebola@gmail.com", user.getEmail());
        assertEquals("Adebola", user.getFirstName());
        assertEquals("Ajibade", user.getLastName());
        assertEquals("adebola2020", user.getPassword());

    }

}
