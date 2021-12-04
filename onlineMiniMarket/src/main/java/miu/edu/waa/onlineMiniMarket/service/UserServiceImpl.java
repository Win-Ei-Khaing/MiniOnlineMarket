package miu.edu.waa.onlineMiniMarket.service;

import miu.edu.waa.onlineMiniMarket.dto.UserDto;
import miu.edu.waa.onlineMiniMarket.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<UserDto> findAll() {
        return userRepository.findAll()
                .stream()
                .map(u->modelMapper.map(u, UserDto.class))
                .collect(Collectors.toList());
    }
}
