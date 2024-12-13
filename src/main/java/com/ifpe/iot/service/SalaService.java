package com.ifpe.iot.service;

import com.ifpe.iot.entity.Sala;
import com.ifpe.iot.repository.ISalaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SalaService {
    private final ISalaRepository salaRepository;

    public Sala save(Sala sala) {
        return salaRepository.save(sala);
    }
    public List<Sala> findAll() {
        return salaRepository.findAll();
    }
}
