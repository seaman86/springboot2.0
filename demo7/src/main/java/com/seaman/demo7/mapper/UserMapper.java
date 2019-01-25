package com.seaman.demo7.mapper;

import com.seaman.demo7.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-01-25 14:10
 * 功能描述:
 * 修改历史:
 */

@Mapper
public interface UserMapper {

    /**
     * 根据用户名查询用户结果集
     *
     * @param userName 用户名
     * @return 查询结果
     */
    @Select("SELECT * FROM t_user WHERE user_name = #{user_name}")
    List<User> findByUsername(@Param("user_name") String userName);


    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 成功 1 失败 0
     */
    int insert(User user);

}
