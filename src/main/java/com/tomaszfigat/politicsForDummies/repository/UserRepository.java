package com.tomaszfigat.politicsForDummies.repository;

import com.tomaszfigat.politicsForDummies.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long> {

//    @Query("select p from User p where p.name = :name")
    User findByUserName(String username);
}
