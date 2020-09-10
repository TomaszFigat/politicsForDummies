package com.tomaszfigat.politicsForDummies.DTO;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class CommentDTO {


    private LocalDateTime date;
    private String text;
    private UserDTO userDTO;
}
