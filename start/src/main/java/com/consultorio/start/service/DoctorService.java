package com.consultorio.start.service;

import java.util.List;

import com.consultorio.start.entity.Doctor;

public interface DoctorService {
	
    public Doctor saveDoctor(Doctor doctor);
    public List<Doctor> getAllDoctor();
    public Doctor getDoctorById(Long id);
    //public void deleteInvoiceById(Long id);
    public void updateDoctor(Doctor doctor);
	
}
