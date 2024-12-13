package com.ifpe.iot.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(of = "id")
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public  class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column
    private LocalDate birthDate;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "cpf" , unique = true)
    private String cpf;

    @Enumerated(EnumType.STRING)
    @Column
    @ElementCollection
    @CollectionTable(name="user_acessLevels",joinColumns = @JoinColumn(name="user_id"))
    private List<AcessLevel> acessLevels;
}
