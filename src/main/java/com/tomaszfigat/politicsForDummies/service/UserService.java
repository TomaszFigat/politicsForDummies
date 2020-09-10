package com.tomaszfigat.politicsForDummies.service;

import com.tomaszfigat.politicsForDummies.mapper.UserDTO;
import com.tomaszfigat.politicsForDummies.repository.UserRepository;
import com.tomaszfigat.politicsForDummies.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
//    private final UserMapper userMapper;
//
//    @Transactional
//    public List<UserDTO> findAll(){
//        return userRepository.findAll().stream().map(e->userMapper.map(e)).collect(Collectors.toList());
//    }
//
//    @Transactional
//    public UserDTO findById(Long theId){
//        return userMapper.map(userRepository.findById(theId).orElseThrow());
//    }

    public User findByName(String userName){
        return null;
    }

    @Transactional
    public User save(User user){
        return userRepository.save(user);
    }

    @Transactional
    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

}
