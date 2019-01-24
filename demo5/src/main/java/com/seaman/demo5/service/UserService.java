package com.seaman.demo5.service;

import com.seaman.demo5.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-01-24 17:57
 * 功能描述:
 * 修改历史:
 */

@Service
public class UserService implements IUserService {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> getList() {
        // 查询所有用户
        String sql = "SELECT * FROM t_user";
        return jdbcTemplate.query(sql, new Object[]{}, new BeanPropertyRowMapper<>(User.class));

    }

    @Override
    public User getById(Long id) {
        // 根据主键ID查询
        String sql = "SELECT * FROM t_user WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(User.class));

    }

    @Override
    public long delete(Long id) {
        // 根据主键ID删除用户信息
        String sql = "DELETE FROM t_user WHERE id = ?";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public long update(Long id, User user) {
        // 根据主键ID修改用户信息
        String sql = "UPDATE t_user SET username = ? ,password = ? WHERE id = ?";
        return jdbcTemplate.update(sql, user.getUserName(), user.getPassword(), id);
    }

    @Override
    public long insert(User user) {
        // 添加用户
        String sql = "INSERT INTO t_user(username, password) VALUES(?, ?)";
        return jdbcTemplate.update(sql, user.getUserName(), user.getPassword());
    }
}
