package com.hrms.business.abstracts;

import com.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
