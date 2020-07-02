package cn.juechen.crud.mapper;

import cn.juechen.crud.entities.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //获取全部用户
    public List<User> getUsers();
    //根据id获取用户
    public User getUserById(Integer id);
    //增加用户
    public int insertUser(User user);
    //根据id删除用户
    public int delUserById(Integer id);
    //修改用户
    public int updatePasswordById(User user);
}
