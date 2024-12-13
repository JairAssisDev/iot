package com.ifpe.iot.repository;


import com.ifpe.iot.entity.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISalaRepository extends JpaRepository<Sala, Long> {
}
