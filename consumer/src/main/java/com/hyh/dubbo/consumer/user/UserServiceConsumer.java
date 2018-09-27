package com.hyh.dubbo.consumer.user;

import com.hyh.dubbo.api.user.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016/1/19.
 */
public class UserServiceConsumer {

    private static Logger logger = LoggerFactory.getLogger(UserServiceConsumer.class);

    public static void main(String args[]) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        int i = 0;
        while (i++ < 5)
        {
            IUserService userService = (IUserService) ctx.getBean("userService");
            logger.info("执行结果：" + userService.login("hello world","hello"));
            logger.info("执行结果：" + userService.login("hello world"));
        }
    }
}
