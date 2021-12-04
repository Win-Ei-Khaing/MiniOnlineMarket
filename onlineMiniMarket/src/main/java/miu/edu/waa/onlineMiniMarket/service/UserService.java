package miu.edu.waa.onlineMiniMarket.service;

import miu.edu.waa.onlineMiniMarket.dto.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> findAll();
}
