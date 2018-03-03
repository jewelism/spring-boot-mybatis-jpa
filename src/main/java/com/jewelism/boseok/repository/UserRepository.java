package com.jewelism.boseok.repository;

import com.jewelism.boseok.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findTop5ByOrderByScoreDesc();
}

