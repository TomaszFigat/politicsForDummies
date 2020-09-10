package com.tomaszfigat.politicsForDummies.mapper;

import com.tomaszfigat.politicsForDummies.entity.Post;

public class PostMapper {

    public static PostDTO map(Post post){
        return PostDTO.builder()
                .title(post.getTitle())
                .text(post.getText())
                //TODO user mapper
                .date(post.getDate())
                .build();

    }
}
