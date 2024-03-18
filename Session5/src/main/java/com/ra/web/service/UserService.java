package com.ra.web.service;

import com.ra.web.model.entity.User;

import java.util.List;
import java.util.function.Predicate;

public interface UserService {
    List<User> findAll();
    boolean checkExist(Predicate<User> predicate);
    User findSingle(Predicate<User> predicate);
    List<User> findBy(Predicate<User> predicate);
    User findId(String id);
    User add(User user);
    User edit(User user);
    boolean remove(String id);
}
