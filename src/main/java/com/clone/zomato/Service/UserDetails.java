package com.clone.zomato.Service;

import com.clone.zomato.Entity.UserInfo;
import com.clone.zomato.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetails {
    @Autowired
    private UserRepository userRepository;

    public UserInfo createUser(UserInfo userInfo)
    {
        userInfo.setUserId(userInfo.getUserId());
        userInfo.setEmail(userInfo.getEmail());
        userInfo.setFirstName(userInfo.getFirstName());
        userInfo.setLastName(userInfo.getLastName());
        return userRepository.save(userInfo);
    }
}
