package com.tomaszfigat.politicsForDummies.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Getter
public class UserDTO {

    private String userName;
    private String firstName;
    private String lastName;
    private String email;
   // private String password;



}
