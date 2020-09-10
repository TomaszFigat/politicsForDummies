package com.tomaszfigat.politicsForDummies.mapper;

import com.tomaszfigat.politicsForDummies.DTO.PostDTO;
import com.tomaszfigat.politicsForDummies.entity.Post;
import org.springframework.stereotype.Component;


public class PostMapper {

    public static PostDTO map(Post post){
        return PostDTO.builder()
                .title(post.getTitle())
                .text(post.getText())
                .userDTO(UserMapper.map(post.getUser()))
                .date(post.getDate())
                .build();

    }
}
