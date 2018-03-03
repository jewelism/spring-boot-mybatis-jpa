package com.jewelism.boseok.mapper;

import com.jewelism.boseok.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper{
    @Select("select * from users")
    List<User> findAll();

    @Select("select * from users order by score desc limit 5")
    List<User> findTop5ByOrderByScoreDesc();

    @Results(id = "user", value = {
            @Result(property = "name", column = "name"),
            @Result(property = "score", column = "score"),
    })
    @Insert("insert into users(name, score) values(#{name}, #{score})")
    Object save(User user);

    @Select("select count(*) from users")
    long count();
}
