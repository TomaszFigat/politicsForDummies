package com.tomaszfigat.politicsForDummies.repository;

import com.tomaszfigat.politicsForDummies.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    @Query("select p from Comment p where post_id = :id ")
    List<Comment> findAllByPostId(@Param("id") Long id);
}
