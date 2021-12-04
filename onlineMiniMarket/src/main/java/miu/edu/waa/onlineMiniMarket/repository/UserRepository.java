package miu.edu.waa.onlineMiniMarket.repository;

import miu.edu.waa.onlineMiniMarket.domain.User;
import miu.edu.waa.onlineMiniMarket.dto.UserDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    public List<User> findAll();
}
