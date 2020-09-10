package com.tomaszfigat.politicsForDummies.service;

import com.tomaszfigat.politicsForDummies.entity.Comment;
import com.tomaszfigat.politicsForDummies.mapper.CommentDTO;
import com.tomaszfigat.politicsForDummies.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CommentService {

    private CommentRepository commentRepository;
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
