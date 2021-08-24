package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.model.User;

import java.util.List;

public interface UserService
{
    User create( User user );

    User findById( String id );

    List<User> all();

    boolean deleteById( String id );

    User update( UserDto userDto, String id );
}
