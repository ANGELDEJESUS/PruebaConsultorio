package com.consultorio.start.service.imp;

import java.util.List;
import java.util.Optional;

import javax.print.attribute.Attribute;
import javax.print.attribute.DocAttribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultorio.start.entity.Doctor;
import com.consultorio.start.exception.DoctorExceptions;
import com.consultorio.start.repository.DoctorRepository;
import com.consultorio.start.service.DoctorService;
@Service
public class DoctorServiceImp implements DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public Doctor saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> getAllDoctor() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(Long id) {
		// TODO Auto-generated method stub
		Optional<Doctor> doc =doctorRepository.findById(id);
		if(doc.isPresent()) {
			return doc.get();
			
		}else {
			throw new DoctorExceptions("No se encontro el doctor con id"+id);
		}
	}

	@Override
	public void updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		 doctorRepository.save(doctor);
	}

}
