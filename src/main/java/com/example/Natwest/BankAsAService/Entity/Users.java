package com.example.Natwest.BankAsAService.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Employeeinfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstname;
    private String lastname;
    private String password;
    private String mobilenumber;
    private String emailid;
    private String Aadharcardnumber;
    private String dateofbirth;
    private String accountNumber;
    private int Accountbalance;
}
