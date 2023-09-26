package com.example.Natwest.BankAsAService.Repository;

import com.example.Natwest.BankAsAService.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users,Integer> {
    Users findByAccountNumber(String AccountNumber);
}
