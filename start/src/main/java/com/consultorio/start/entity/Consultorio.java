package com.consultorio.start.entity;

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
public class Consultorio {
	@Id
	@GeneratedValue
	private Long id;
	private int numero;
	private String piso;
	
	@Override
	public String toString() {
		return numero+" "+piso+" ";
	}
	

	public Consultorio(int numero, String piso) {
		super();
		this.numero = numero;
		this.piso = piso;
	}
	public Long getId(){
		return id;
	}
	public int getNumero(){
		return numero;
	}
	public String getPiso(){
		return piso;
	}
	
}
