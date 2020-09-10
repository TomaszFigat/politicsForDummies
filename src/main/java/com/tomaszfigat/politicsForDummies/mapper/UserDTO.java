package com.tomaszfigat.politicsForDummies.mapper;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
public class UserDTO {

    private String name;
    private String lastName;
    private String email;
   // private String password;



}
