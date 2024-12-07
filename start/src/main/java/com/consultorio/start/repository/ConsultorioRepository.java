package com.consultorio.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consultorio.start.entity.Consultorio;
import com.consultorio.start.entity.Doctor;
@Repository
public interface ConsultorioRepository extends JpaRepository<Consultorio, Long> {

}
