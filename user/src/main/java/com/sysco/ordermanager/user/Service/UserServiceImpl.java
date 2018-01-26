package com.sysco.ordermanager.user.Service;

import com.sysco.ordermanager.user.model.User;
import com.sysco.ordermanager.user.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User findBySSO(String sso) {
        return null;
    }

    @Override
    public void saveUser(User user) {
        userDAO.save(user);
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserBySSO(String sso) {

    }

    @Override
    public List<User> findAllUsers() {
        return null;
    }

    @Override
    public boolean isUserSSOUnique(Integer id, String sso) {
        return false;
    }
}
