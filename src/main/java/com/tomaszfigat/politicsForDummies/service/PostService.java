package com.tomaszfigat.politicsForDummies.service;

import com.tomaszfigat.politicsForDummies.entity.Post;
import com.tomaszfigat.politicsForDummies.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class PostService {

    private PostRepository postRepository;

    @Transactional
    public List<Post> findAll(){
        return postRepository.findAll();
    }

//    @Transactional
//    public Post findById(Long theId) {
//        return postRepository.findById(theId).orElseThrow();
//    }

    @Transactional
    public Post findById(Long theId) {
        return postRepository.findById(theId).orElseThrow();
    }

    @Transactional
    public Post save(Post post){
        return postRepository.save(post);
    }

    @Transactional
    public void deleteById(Long id){
        postRepository.deleteById(id);
    }
}
