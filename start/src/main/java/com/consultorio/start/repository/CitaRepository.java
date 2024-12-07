package com.consultorio.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.consultorio.start.entity.Cita;
import com.consultorio.start.entity.Doctor;
@Repository
public interface CitaRepository extends JpaRepository<Cita, Long> {

}
