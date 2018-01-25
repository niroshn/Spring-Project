package com.sysco.ordermanager.user.dao;


import com.sysco.ordermanager.user.Model.User;

import java.util.List;

public interface UserDAO {

    User findById(int id);

    User findBySSO(String sso);

    void save(User user);

    void deleteBySSO(String sso);

    List<User> findAllUsers();

}
