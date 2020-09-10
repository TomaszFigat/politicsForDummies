package com.tomaszfigat.politicsForDummies.mapper;

import com.tomaszfigat.politicsForDummies.DTO.CommentDTO;
import com.tomaszfigat.politicsForDummies.DTO.UserDTO;
import com.tomaszfigat.politicsForDummies.entity.Comment;

public class CommentMapper {
    public static CommentDTO map(Comment comment) {
        return CommentDTO.builder()
                .text(comment.getText())
                .date(comment.getDate())
                .userDTO(UserMapper.map(comment.getUser()))
                .build();
    }
}
