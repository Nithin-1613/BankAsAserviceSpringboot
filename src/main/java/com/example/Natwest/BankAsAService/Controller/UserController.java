package com.example.Natwest.BankAsAService.Controller;

import com.example.Natwest.BankAsAService.Entity.Users;
import com.example.Natwest.BankAsAService.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/baas")
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    UserServices userServices;

    @PostMapping("/addUser")
    public ResponseEntity<Users> addUser(@RequestBody Users user)
    {
        return new ResponseEntity<>(userServices.addUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/getUser/{accNo}")
    public ResponseEntity<Users> getUser(@PathVariable String accNo)
    {
        return new ResponseEntity<>(userServices.getUser(accNo),HttpStatus.OK);
    }
}
