package com.example.test_wxrequest.mapper;

import com.example.test_wxrequest.domain.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UsersMapper {

    Users findAllUsers(Users users);
}
