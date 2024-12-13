package com.ifpe.iot.adapter;

import com.ifpe.iot.dtos.UserCreateDto;
import com.ifpe.iot.dtos.UserResponseDto;
import com.ifpe.iot.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserAdapter {


    public static User ToUserEntity(UserCreateDto userCreateDto) {
        User user = new User();
        user.setCpf(userCreateDto.getCpf());
        user.setEmail(userCreateDto.getEmail());
        user.setName(userCreateDto.getName());
        user.setPassword(userCreateDto.getPassword());
        user.setAcessLevels(userCreateDto.getAcessLevels());
        return user;
    }
    public static UserResponseDto ToUserCreateDto(User user) {
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setCpf(user.getCpf());
        userResponseDto.setEmail(user.getEmail());
        userResponseDto.setName(user.getName());
        userResponseDto.setPassword(user.getPassword());
        userResponseDto.setAcessLevels(user.getAcessLevels());
        return userResponseDto;
    }

    public static List<UserResponseDto> ToDtoUserList(List<User> users) {
        List<UserResponseDto>userResponseDtos = new ArrayList<>();
        for (User user : users) {
            UserResponseDto userDto = UserAdapter.ToUserCreateDto(user);
            userResponseDtos.add(userDto);
        }
        return userResponseDtos;
    }
}
