package miu.edu.waa.onlineMiniMarket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import miu.edu.waa.onlineMiniMarket.domain.Role;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
    private int id;
    private String name;
    private String address;
    private String phone;
    private Role role;
}
