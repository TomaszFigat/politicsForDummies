package com.tomaszfigat.politicsForDummies.mapper;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class CommentDTO {

    private Long id;
    private LocalDateTime date;
    private String text;
}
