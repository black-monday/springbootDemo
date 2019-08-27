package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.dao.UserDao;
import com.example.demo.dao.UserXmlDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Autowired
    private UserXmlDao UserXmlDao ;

    public User selectUserByName(String name) {
//        return userDao.findUserByName(name);
        return UserXmlDao.findUserByName(name);
    }

    public List<User> selectAllUser() {
        return userDao.findAllUser();
    }

    public void insertService() {
        userDao.insertUser("SnailClimb", 22, 3000.0);
        userDao.insertUser("Daisy", 19, 3000.0);
    }

    public void deleteService(int id) {
        userDao.deleteUser(id);
    }
    @Transactional
    public void changemoney() {
        userDao.updateUser("SnailClimb", 22, 2000.0, 3);
        // 模拟转账过程中可能遇到的意外状况
        int temp = 1 / 0;
        userDao.updateUser("Daisy", 19, 4000.0, 4);
    }


}
