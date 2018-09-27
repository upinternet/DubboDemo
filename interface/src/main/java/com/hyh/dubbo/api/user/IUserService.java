package com.hyh.dubbo.api.user;

public interface IUserService {

    /**
     * 登录方法
     * @return 是否登录成功
     */
    public boolean login(String username, String password);
    public String login(String username);
}