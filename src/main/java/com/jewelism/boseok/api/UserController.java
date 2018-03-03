package com.jewelism.boseok.api;

import com.jewelism.boseok.domain.ResponseDTO;
import com.jewelism.boseok.domain.User;
import com.jewelism.boseok.domain.UserDTO;
import com.jewelism.boseok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("all")
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("ranker")
    public List<User> findRanker(){
        return userService.findRanker();
    }


    @PostMapping("save")
    public ResponseDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO.toUser());
    }


//    @GetMapping("greeting")
//    public Map<String, Object> greeting() {
//        return userService.greeting();
//    }
}
