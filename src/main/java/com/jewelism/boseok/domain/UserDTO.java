package com.jewelism.boseok.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserDTO {
    String name;
    int score;

    public User toUser(){
        return new User(null, getName(), null, getScore());
    }
}
