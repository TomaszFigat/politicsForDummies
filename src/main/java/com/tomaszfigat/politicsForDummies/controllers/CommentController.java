package com.tomaszfigat.politicsForDummies.controllers;

import com.tomaszfigat.politicsForDummies.DTO.CommentDTO;
import com.tomaszfigat.politicsForDummies.mapper.CommentMapper;
import com.tomaszfigat.politicsForDummies.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController

@Log4j2
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;


    @GetMapping("posts/{id}/comments")
    public List<CommentDTO> findAllByPostId(@PathVariable Long id){
        return commentService.findAllByPostId(id).stream()
                .map(CommentMapper::map)
                .collect(Collectors.toList());
    }
}
