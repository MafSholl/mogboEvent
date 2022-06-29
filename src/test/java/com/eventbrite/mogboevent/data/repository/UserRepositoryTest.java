package com.eventbrite.mogboevent.data.repository;

import com.eventbrite.mogboevent.data.models.User;
import com.eventbrite.mogboevent.data.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
@Service
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

//    @Test
//    public void userRepositoryTest(){
//        User user1 = new User();
//        user1.setId("1");
//        user1.setEmail("ajibadeadebola@gmail.com");
//        user1.setFirstName("Adebola");
//        user1.setLastName("Ajibade");
//        user1.setPassword("adebola2020");
//
//        User user2 = new User();
//        user2.setId("2");
//        user2.setEmail("basseyjnr@gmail.com");
//        user2.setFirstName("Badd");
//        user2.setLastName("Baszi");
//        user2.setPassword("badd2020");
//
//        userRepository.save(user1);
//        userRepository.save(user2);
//
//        Optional <User> firstUser = userRepository.findByEmail("ajibadeadebola@gmail.com");
//        Optional <User> secondUser = userRepository.findByEmail("basseyjnr@gmail.com");
//
//        assertEquals("Adebola", firstUser.get().getFirstName());
//        assertEquals("Badd", secondUser.get().getFirstName());
//    }
}
