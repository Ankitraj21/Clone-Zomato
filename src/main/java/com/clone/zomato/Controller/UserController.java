package com.clone.zomato.Controller;

import com.clone.zomato.Entity.UserInfo;
import com.clone.zomato.Service.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/zomato")
public class UserController {
    @Autowired
    private UserDetails userDetails;

    @PostMapping("/createUser")
    public ResponseEntity<UserInfo>createUser(@RequestBody UserInfo userInfo)
    {
        try
        {
            userInfo=userDetails.createUser(userInfo);
        }
        catch (Exception e){

        }
       return null;
    }
}
