package com.consultorio.start.entity;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cita {
	@Id
	@GeneratedValue
	private Long id;
	private Long consultorio;
	private Long doctor;	
	@Column
	@DateTimeFormat
	private String horario;
	private String nombrePaciente;
	
	public Cita(Long consultorio, Long doctor, String horario, String nombrePaciente) {
		super();
		this.consultorio = consultorio;
		this.doctor = doctor;
		this.horario = horario;
		this.nombrePaciente = nombrePaciente;
	}
	public Long getId(){
		return id;
	}
	public Long getConsultorio(){
		return consultorio;
	}
	public Long getDoctor(){
		return doctor;
	}
	public String getHorario(){
		return horario;
	}
	public String getNombrePaciente(){
		return nombrePaciente;
	}

	@Override
	public String toString() {
		return consultorio+" "+doctor+" "+nombrePaciente+" ";
	}
}
