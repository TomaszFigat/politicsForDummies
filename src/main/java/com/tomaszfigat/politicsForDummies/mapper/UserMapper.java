package com.tomaszfigat.politicsForDummies.mapper;

import com.tomaszfigat.politicsForDummies.DTO.PostDTO;
import com.tomaszfigat.politicsForDummies.DTO.UserDTO;
import com.tomaszfigat.politicsForDummies.entity.User;

public class UserMapper {


    public static UserDTO map(User user) {
        return UserDTO.builder()
                .name(user.getName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .build();
    }
}