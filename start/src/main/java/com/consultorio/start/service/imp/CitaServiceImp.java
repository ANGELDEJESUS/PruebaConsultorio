package com.consultorio.start.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultorio.start.entity.Cita;
import com.consultorio.start.exception.CitaExceptions;
import com.consultorio.start.repository.CitaRepository;
import com.consultorio.start.service.CitaService;
@Service
public class CitaServiceImp implements CitaService {
	@Autowired
	private CitaRepository citaRepository;
	
	
	@Override
	public Cita saveCita(Cita cita) {
		// TODO Auto-generated method stub
		return citaRepository.save(cita);
	}

	@Override
	public List<Cita> getAllCita() {
		// TODO Auto-generated method stub
		return citaRepository.findAll();
	}

	@Override
	public Cita getCitaById(Long id) {
		// TODO Auto-generated method stub
		Optional<Cita> ci = citaRepository.findById(id);
		if(ci.isPresent()) {
			return ci.get();
		}else {
			throw new CitaExceptions("No se encontro cita con ID: "+id );	
		}
	}

	@Override
	public void updateCita(Cita cita) {
		// TODO Auto-generated method stub
		citaRepository.save(cita);
	}

}
