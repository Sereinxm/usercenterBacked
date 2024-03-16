package com.example.backed.service;

import com.example.backed.model.domain.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
/**
 * 用户服务测试
 * **/

@SpringBootTest
class UserServiceTest {


    @Resource
    private UserService userService;


    @Test
    void testAddUser(){
        User user = new User();

        user.setUsername("31dsa23");
        user.setUserAccount("123456");
        user.setAvatarUrl("https://i.postimg.cc/c1pGgkZh/16070652274615705.jpg");
        user.setGender(0);
        user.setUserPassword("123456");
        user.setPhone("123456");
        user.setEmail("123456");
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }
    @Test
    void userRegister(){

        String userAccount="caoc6dao";
        String userPassword="123456789";
        String checkPassword="123456789";
        String planetCode="18";
        long result= userService.userRegister(userAccount,userPassword,checkPassword,planetCode);
        Assertions.assertTrue(result>0);

        userAccount="yu6fds8ta";
        userPassword="123456789";
        checkPassword="123456789";
        planetCode="218";
        result =userService.userRegister(userAccount,userPassword,checkPassword,planetCode);
        Assertions.assertTrue(result>0);

        userAccount="yupd6si";
        userPassword="123456789";
        checkPassword="123456789";
        planetCode="847";
        result =userService.userRegister(userAccount,userPassword,checkPassword,planetCode);
        Assertions.assertTrue(result>0);

        userAccount="yu5465";
        userPassword="123456789";
        planetCode="115";
        result =userService.userRegister(userAccount,userPassword,checkPassword,planetCode);
        Assertions.assertTrue(result>0);

        userAccount="yu656445";
        userPassword="123456789";
        planetCode="86";
        result =userService.userRegister(userAccount,userPassword,checkPassword,planetCode);
        Assertions.assertTrue(result>0);

        userAccount="yu7856pi";
        userPassword="123456789";
        checkPassword="123456789";
        planetCode="45";
        result =userService.userRegister(userAccount,userPassword,checkPassword,planetCode);
        Assertions.assertTrue(result>0);

        userAccount="wangpie6wrng";
        userPassword="123456789";
        checkPassword="123456789";
        planetCode="765";
        result =userService.userRegister(userAccount,userPassword,checkPassword,planetCode);
        Assertions.assertTrue(result>0);
        userAccount="waengp6ieng";
        userPassword="123456789";
        checkPassword="123456789";
        planetCode="123";
        result =userService.userRegister(userAccount,userPassword,checkPassword,planetCode);
        Assertions.assertTrue(result>0);
        userAccount="wangp6ieng";
        userPassword="123456789";
        checkPassword="123456789";
        planetCode="136";
        result =userService.userRegister(userAccount,userPassword,checkPassword,planetCode);
        Assertions.assertTrue(result>0);
        userAccount="wangp6ireng";
        userPassword="123456789";
        checkPassword="123456789";
        planetCode="145";
        result =userService.userRegister(userAccount,userPassword,checkPassword,planetCode);
        Assertions.assertTrue(result>0);



    }
}