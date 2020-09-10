package com.tomaszfigat.politicsForDummies.repository;

import com.tomaszfigat.politicsForDummies.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
