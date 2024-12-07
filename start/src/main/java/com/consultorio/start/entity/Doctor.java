package com.consultorio.start.entity;

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
public class Doctor {
	@Id
	@GeneratedValue
	private Long id;
	private String nombre;
	private String ap1;
	private String ap2;
	private String esp;
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String nombre, String ap1, String ap2, String esp) {
		super();
		this.nombre = nombre;
		this.ap1 = ap1;
		this.ap2 = ap2;
		this.esp = esp;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getAp1() {
		return ap1;
	}

	public String getAp2() {
		return ap2;
	}

	public String getEsp() {
		return esp;
	}

	@Override
	public String toString() {
		return nombre+" "+ap1+" "+ap2+" "+esp+" ";
	}
}
