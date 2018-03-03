package com.jewelism.boseok.service;

import com.jewelism.boseok.domain.ResponseDTO;
import com.jewelism.boseok.domain.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> findAll();
    List<User> findRanker();
    ResponseDTO saveUser(User user);
//    Map<String, Object> greeting();
}
