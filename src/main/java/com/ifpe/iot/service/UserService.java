package com.ifpe.iot.service;

import com.ifpe.iot.entity.User;
import com.ifpe.iot.repository.IUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private IUserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void delete(String cpf) {

        User user = userRepository.findByCpf(cpf).orElseThrow(()->new RuntimeException("Usuario não encontrado"));
        userRepository.delete(user);
        }

    public User update(User user) {
        User userOld = userRepository.findByCpf(user.getCpf()).orElseThrow(()->new RuntimeException("Usuario não encontrado"));
        userOld.setEmail(user.getEmail());
        userOld.setName(user.getName());
        return userRepository.save(user);
    }



}
