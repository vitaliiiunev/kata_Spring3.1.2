package ru.yunev.springboot.Project2Boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.yunev.springboot.Project2Boot.dao.UserDao;
import ru.yunev.springboot.Project2Boot.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public void addUser(User user) {

        userDao.addUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {

        userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void removeUser(int id) {

        userDao.removeUser(id);
    }


    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }


    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}
