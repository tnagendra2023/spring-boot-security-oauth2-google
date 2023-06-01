package com.java.service;

import com.java.dto.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService {

    public List<User> getAllUsers() {
        return Stream.of(new User(1, "nagendra", "nagendra@gmail.com"),
                new User(2, "kumar", "kumar@gmail.com"),
                new User(3, "vihaan", "vihaan@gmail.com"),
                new User(4, "anil", "anil@gmail.com")
        ).collect(Collectors.toList());
    }
}


