package com.ifpe.iot.dtos;

import com.ifpe.iot.entity.AcessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDto{

    private String name;

    private LocalDate birthDate;

    private String cpf;

    private String email;

    private String password;

    private List<AcessLevel> acessLevels;
}
