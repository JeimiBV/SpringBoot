package com.infsis.example.Controllers;

import com.infsis.example.DTOs.UserDTO;
import com.infsis.example.Models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public ResponseEntity<UserDTO> getUsers(){
        UserDTO userDTO=new UserDTO("user", "user@user");
        return ResponseEntity.ok().body(userDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Integer id){
        UserDTO userDTO=new UserDTO("user", "user@user");
        return ResponseEntity.ok().body(userDTO);
    }

    @PostMapping
    public  ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(userDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Integer id, @RequestBody UserDTO userDTO){
        return ResponseEntity.ok().body(userDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){

    }
}
