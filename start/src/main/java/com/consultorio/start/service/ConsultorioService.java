package com.consultorio.start.service;

import java.util.List;

import com.consultorio.start.entity.Consultorio;

public interface ConsultorioService {
	
    public Consultorio saveConsultorio(Consultorio consultorio);
    public List<Consultorio> getAllConsultorio();
    public Consultorio getConsultorioById(Long id);
    //public void deleteInvoiceById(Long id);
    public void updateConsultorio(Consultorio consultorio);
	
}
