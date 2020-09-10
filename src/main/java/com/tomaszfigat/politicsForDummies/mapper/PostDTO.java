package com.tomaszfigat.politicsForDummies.mapper;

import com.tomaszfigat.politicsForDummies.entity.User;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Builder
@Getter
public class PostDTO {


    private String text;
    private String title;
//    private UserDTO userDTO;
    private LocalDateTime date;


}
