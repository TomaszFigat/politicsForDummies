package com.tomaszfigat.politicsForDummies.service;

import com.tomaszfigat.politicsForDummies.repository.UserRepository;
import com.tomaszfigat.politicsForDummies.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
//    private final UserMapper userMapper;
//
    @Transactional
    public List<User> findAll(){
        return userRepository.findAll();
    }
//
    @Transactional
    public User findById(Long theId){
        return userRepository.findById(theId).orElseThrow();
    }

//    //public User findByName(String userName){
//        return null;
//    }

    @Transactional
    public User save(User user){
        return userRepository.save(user);
    }

    @Transactional
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

}
