package com.seaman.demo10;

import com.seaman.demo10.entity.User;
import com.seaman.demo10.service.IUserService;
import com.seaman.demo10.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Demo10ApplicationTests {
    private static final Logger log = LoggerFactory.getLogger(Demo10ApplicationTests.class);

    @Autowired
    private IUserService userService;


    @Test
    public void test() {
        final User user = userService.saveOrUpdate(new User(5L, "u5", "p5"));
        log.info("[saveOrUpdate] - [{}]", user);
        final User user1 = userService.get(5L);
        log.info("[get] - [{}]", user1);
        userService.delete(5L);
    }

}

