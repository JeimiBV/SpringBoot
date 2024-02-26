package com.infsis.example.Services;

import com.infsis.example.DTOs.UserDTO;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {
    Optional<UserDTO> getUserById(Integer userId);
    UserDTO saveUser (UserDTO userDTO);
    UserDTO updateUser(Integer userId, UserDTO userDTO);
    void delete(Integer userId);
}
