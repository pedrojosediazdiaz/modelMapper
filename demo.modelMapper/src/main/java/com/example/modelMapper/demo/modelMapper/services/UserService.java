package com.example.modelMapper.demo.modelMapper.services;

import com.example.modelMapper.demo.modelMapper.models.User;
import com.example.modelMapper.demo.modelMapper.models.UserDTO;

public interface UserService {
    UserDTO mapUserToDTO(User user);
    User mapDTOToUser(UserDTO userDTO);
}
