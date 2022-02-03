package org.ada.school.service;

import org.ada.school.dto.UserDto;
import org.ada.school.model.User;
import org.ada.school.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Iván Camilo Rincón Saavedra
 * @version 1.0 2/3/2022
 * @project user-api
 */
@Service
public class UserServiceMongoDB implements UserService {
    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }

    @Override
    public User create( User user )
    {
        return null;
    }

    @Override
    public User findById( String id )
    {
        return null;
    }

    @Override
    public List<User> all()
    {
        return null;
    }

    @Override
    public boolean deleteById( String id )
    {
        return false;
    }

    @Override
    public User update(UserDto userDto, String id )
    {
        return null;
    }
}
