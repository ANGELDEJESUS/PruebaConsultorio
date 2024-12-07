package com.consultorio.start.service;

import java.util.List;

import com.consultorio.start.entity.Cita;

public interface CitaService {
	
    public Cita saveCita(Cita cita);
    public List<Cita> getAllCita();
    public Cita getCitaById(Long id);
    //public void deleteInvoiceById(Long id);
    public void updateCita(Cita cita);
	
}
