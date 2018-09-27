package com.hyh.dubbo.provider.user.impl;


import com.hyh.dubbo.api.user.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public boolean login(String username, String password) {
        logger.info("master用户登录：[username:{}, password:{}]", username, password);
        if (username != null && password != null && username.equals(password)) {
            logger.info("用户校验通过。[username:{}]", username);
            return true;
        }
        logger.info("用户校验失败！[username:{}]", username);
        return false;
    }

    public String login(String username) {
        return "slave return : " + username;
    }
}