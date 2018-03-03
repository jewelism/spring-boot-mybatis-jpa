package com.jewelism.boseok.serviceImpl;

import com.jewelism.boseok.domain.ResponseDTO;
import com.jewelism.boseok.domain.User;
import com.jewelism.boseok.mapper.UserMapper;
import com.jewelism.boseok.repository.UserRepository;
import com.jewelism.boseok.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userRepo;
//    @Autowired
//    UserRepository userRepo;

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public List<User> findRanker() {
        return userRepo.findTop5ByOrderByScoreDesc();
    }

    public ResponseDTO saveUser(User user) {
        try {
            if (userRepo.count() < 11)
                userRepo.save(user);
            return ResponseDTO.ofSuccess();
        } catch (Exception e) {
            System.out.println(e);
            return ResponseDTO.ofFail();
        }
    }

//    public Map<String, Object> greeting() {
//        return Collections.singletonMap("msg", "Hello Boseok!");
//    }
}
