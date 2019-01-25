package com.seaman.demo6.repository;

import com.seaman.demo6.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-01-25 11:43
 * 功能描述:
 * 修改历史:
 */

@Repository
public interface IUserRepository extends JpaRepository<User,Long> {

    /**
     * 根据用户名查询用户信息
     *
     * @param user_name 用户名
     * @return 查询结果
     */
    List<User> findAllByUserName(String user_name);
}
