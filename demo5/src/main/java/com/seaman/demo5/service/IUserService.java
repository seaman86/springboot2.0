package com.seaman.demo5.service;

import com.seaman.demo5.dao.entity.User;

import java.util.List;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-01-24 17:54
 * 功能描述:
 * 修改历史:
 */
public interface IUserService {

    List<User> getList();

    User getById(Long id);

    long delete(Long id);

    long update(Long id, User user);

    long insert(User user);

}
