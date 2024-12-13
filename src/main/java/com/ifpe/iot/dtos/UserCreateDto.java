package com.ifpe.iot.dtos;

import com.ifpe.iot.entity.AcessLevel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
public class UserCreateDto {


    @NotBlank
    @Size(min = 2, max = 140)
    private String name;

    @PastOrPresent
    private LocalDate birthDate;

    @NotBlank
    @Size(min = 11, max = 11)
    private String cpf;

    @NotBlank
    private String email;

    @NotBlank
    private String password;

    @NotNull
    private List<AcessLevel> acessLevels;
}
