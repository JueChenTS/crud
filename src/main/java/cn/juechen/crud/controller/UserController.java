package cn.juechen.crud.controller;

import cn.juechen.crud.entities.Result;
import cn.juechen.crud.entities.User;
import cn.juechen.crud.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/list")
    public Result list(){
        List<User> list=userService.getUsers();
        return Result.ok().put("list",list);
    }

    @GetMapping("/info/{id}")
    public Result info(@PathVariable("id") Integer id){
        User user=userService.getUserById(id);
        return Result.ok().put("user",user);
    }

    @PostMapping("/save")
    public Result save(@RequestBody User user){
        userService.insertUser(user);
        return Result.ok();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody Integer id){
        userService.delUserById(id);
        return Result.ok();
    }

    @PutMapping("/update")
    public Result update(@RequestBody User user){
        userService.updatePasswordById(user);
        return Result.ok();
    }
}
