package miu.edu.waa.onlineMiniMarket.controller;

import miu.edu.waa.onlineMiniMarket.dto.UserDto;
import miu.edu.waa.onlineMiniMarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDto> findAll(){
        return userService.findAll();
    }
}
