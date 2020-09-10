package com.tomaszfigat.politicsForDummies.repository;

import com.tomaszfigat.politicsForDummies.entity.Comment;
import com.tomaszfigat.politicsForDummies.mapper.CommentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {

}
