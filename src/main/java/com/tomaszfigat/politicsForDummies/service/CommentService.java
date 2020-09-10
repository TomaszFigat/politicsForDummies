package com.tomaszfigat.politicsForDummies.service;

import com.tomaszfigat.politicsForDummies.entity.Comment;
import com.tomaszfigat.politicsForDummies.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class CommentService {

    private CommentRepository commentRepository;

    @Transactional
    public List<Comment> findAllByPostId(Long id){
        return commentRepository.findAllByPostId(id);
    }
//    private CommentMapper commentMapper;
//
//    @Transactional
//    public List<CommentDTO> findAll(){
//        return commentRepository.findAll()
//                .stream()
//                .map(e->commentMapper.map(e))
//                .collect(Collectors.toList());
//    }
//
//    @Transactional
//    public CommentDTO findById(Long theId) {
//        return commentMapper.map(commentRepository.findById(theId).orElseThrow());
//    }

    @Transactional
    public Comment save(Comment comment){
        return commentRepository.save(comment);
    }

    @Transactional
    public void deleteById(Long id){
        commentRepository.deleteById(id);
    }
}
