package com.infsis.example.Services.Implement;

import com.infsis.example.DTOs.UserDTO;
import com.infsis.example.Models.User;
import com.infsis.example.Services.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public Optional<UserDTO> getUserById(Integer userId) {
        return Optional.empty();
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO updateUser(Integer userId, UserDTO userDTO) {
        return null;
    }

    @Override
    public void delete(Integer userId) {

    }

    private UserDTO UserToDto(User user){
        UserDTO userDTO=new UserDTO(
                user.getName(),
                user.getEmail()
        );
        return userDTO;
    }

    private User DtoToUser(UserDTO userDTO){
        User user = new User();

        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());

        return user;
    }
}
