package com.example.modelMapper.demo.modelMapper.models;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String completeName;
    private int anos;
    // Getters y setters
}
