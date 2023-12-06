package com.example.modelMapper.demo.modelMapper.services;

import com.example.modelMapper.demo.modelMapper.models.User;
import com.example.modelMapper.demo.modelMapper.models.UserDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    private final ModelMapper modelMapper;

    // @Autowired
    public UserServiceImpl() {
        this.modelMapper = new ModelMapper();

    // Configuración de mapeo personalizado para atributos con diferentes nombres
        TypeMap<User, UserDTO> userToUserDTOTypeMap = modelMapper.createTypeMap(User.class, UserDTO.class);
        userToUserDTOTypeMap.addMapping(User::getFull_Name, UserDTO::setCompleteName);
        userToUserDTOTypeMap.addMapping(User::getEdad, UserDTO::setAnos);
        // más addMapping methods por cada atributo que sea diferente

        TypeMap<UserDTO, User> userDTOToUserTypeMap = modelMapper.createTypeMap(UserDTO.class, User.class);
        userDTOToUserTypeMap.addMapping(UserDTO::getCompleteName, User::setFull_Name);
        userDTOToUserTypeMap.addMapping(UserDTO::getAnos, User::setEdad);
        // más addMapping methods por cada atributo que sea diferente


    }

    @Override
    public UserDTO mapUserToDTO(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public User mapDTOToUser(UserDTO userDTO) {
        return modelMapper.map(userDTO, User.class);
    }
}
