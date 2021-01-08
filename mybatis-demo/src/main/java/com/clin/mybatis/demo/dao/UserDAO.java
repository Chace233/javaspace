package com.clin.mybatis.demo.dao;

import com.clin.mybatis.demo.entity.User;

public interface UserDAO {

    User findById(Long id);
}
