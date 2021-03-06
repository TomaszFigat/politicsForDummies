package com.tomaszfigat.politicsForDummies.controllers;

import com.tomaszfigat.politicsForDummies.mapper.PostMapper;
import com.tomaszfigat.politicsForDummies.DTO.PostDTO;
import com.tomaszfigat.politicsForDummies.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Sort;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("posts")
@Log4j2
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping()
    public List<PostDTO> getPosts(@RequestParam(required = false) Integer page, Sort.Direction sort) {
        int pageNumber = page != null && page >= 0 ? page : 0;
        Sort.Direction sortDirection = sort != null ? sort : Sort.Direction.ASC;
        return postService.findAll().stream()
                .map(PostMapper::map)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PostDTO getPostById(@PathVariable Long id){
        return PostMapper.map(postService.findById(id));
    }
}
