package cn.juechen.crud.service.impl;

import cn.juechen.crud.entities.User;
import cn.juechen.crud.mapper.UserMapper;
import cn.juechen.crud.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> getUsers() {
        return userMapper.getUsers();
    }

    public User getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public int delUserById(Integer id) {
        return userMapper.delUserById(id);
    }

    public int updatePasswordById(User user) {
        return userMapper.updatePasswordById(user);
    }
}
