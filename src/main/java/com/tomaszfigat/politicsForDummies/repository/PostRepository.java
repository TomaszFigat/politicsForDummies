package com.tomaszfigat.politicsForDummies.repository;

import com.tomaszfigat.politicsForDummies.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
