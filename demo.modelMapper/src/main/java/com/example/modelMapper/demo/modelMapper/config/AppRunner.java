package com.example.modelMapper.demo.modelMapper.config;

import com.example.modelMapper.demo.modelMapper.models.User;
import com.example.modelMapper.demo.modelMapper.models.UserDTO;
import com.example.modelMapper.demo.modelMapper.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final UserService userService;

    @Autowired
    public AppRunner(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) {
        // Datos hardcodeados
        User user = new User();
        user.setId(1L);
        user.setUsername("john_doe");
        user.setEmail("john.doe@example.com");
        user.setFull_Name("JOHN DOE");
        user.setEdad(10);

        // Mapear User a UserDTO y mostrar en consola
        UserDTO userDTO = userService.mapUserToDTO(user);
        System.out.println("UserDTO: " + userDTO.getUsername() + ", " + userDTO.getId()
                + ", " + userDTO.getCompleteName() + ", " + userDTO.getAnos());

        // Mapear UserDTO a User y mostrar en consola
        User mappedUser = userService.mapDTOToUser(userDTO);
        System.out.println("Mapped User: " + mappedUser.getUsername() + ", " + mappedUser.getId()
                 + ", " + mappedUser.getFull_Name() + ", " + mappedUser.getEdad());
    }
}
