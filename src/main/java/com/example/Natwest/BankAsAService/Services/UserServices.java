package com.example.Natwest.BankAsAService.Services;

import com.example.Natwest.BankAsAService.Entity.Users;
import com.example.Natwest.BankAsAService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {
    @Autowired
    UserRepository userRepository;
    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    public Users getUser(String accNo) {
        return userRepository.findByAccountNumber(accNo);
    }
}
