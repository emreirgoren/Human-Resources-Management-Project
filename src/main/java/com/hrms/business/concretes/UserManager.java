package com.hrms.business.concretes;

import com.hrms.business.abstracts.UserService;
import com.hrms.dataAccess.abstracts.UserDao;
import com.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;
    @Autowired
    public UserManager(UserDao userDao) {
        super();
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {

        return userDao.findAll();
    }
}
