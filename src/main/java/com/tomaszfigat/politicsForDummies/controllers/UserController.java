package com.tomaszfigat.politicsForDummies.controllers;

import com.tomaszfigat.politicsForDummies.mapper.UserDTO;
import com.tomaszfigat.politicsForDummies.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
@Log4j2
@RequiredArgsConstructor
public class UserController {



    private final UserService userService;
//    private final UserMapper userMapper;
//
//
//    @GetMapping()
//    public List<UserDTO> geAllUser() {
//        return userService.findAll();
//    }
////
//    @GetMapping("/{theId}")
//    public UserDTO getUser(@PathVariable Long theId) {
//           return userService.findById(theId);
//    }
//
//    @PostMapping
//    public UserDTO addUser(@RequestBody UserDTO userDTO){
//         userService.save(userMapper.toUser(userDTO));
//         return  userDTO;
//    }

//    @PutMapping("/{id}")
//    public updateUser
//    @PostMapping()
//    public UserDTO addUser(@RequestBody User user){
//        return new UserDTO(userService.addUser(user));
//    }


}
