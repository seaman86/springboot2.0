package com.seaman.demo5.controller;

import com.seaman.demo5.dao.entity.User;
import com.seaman.demo5.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-01-24 17:17
 * 功能描述:
 * 修改历史:
 */

@RestController
@RequestMapping("/users")
public class SpringJdbcController {

    private IUserService userService;

    @Autowired
    public SpringJdbcController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> queryUsers() {
        return userService.getList();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getById(id);
    }

    @DeleteMapping("/{id}")
    public long delUser(@PathVariable Long id) {
        return userService.delete(id);
    }

    @PostMapping
    public long addUser(@RequestBody User user) {
        return userService.insert(user);
    }


    @PutMapping("/{id}")
    public long editUser(@PathVariable Long id, @RequestBody User user) {
        return userService.update(id, user);
    }
}
