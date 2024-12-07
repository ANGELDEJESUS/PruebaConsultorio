package com.consultorio.start.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultorio.start.entity.Consultorio;
import com.consultorio.start.entity.Doctor;
import com.consultorio.start.exception.ConsultorioExceptions;
import com.consultorio.start.exception.DoctorExceptions;
import com.consultorio.start.repository.ConsultorioRepository;
import com.consultorio.start.service.ConsultorioService;
@Service
public class ConsultorioServiceImp implements ConsultorioService {

	@Autowired
	private ConsultorioRepository consultorioRepository;
	
	@Override
	public Consultorio saveConsultorio(Consultorio consultorio) {
		// TODO Auto-generated method stub
		return consultorioRepository.save(consultorio);
	}

	@Override
	public List<Consultorio> getAllConsultorio() {
		// TODO Auto-generated method stub
		return consultorioRepository.findAll();
	}

	@Override
	public Consultorio getConsultorioById(Long id) {
		// TODO Auto-generated method stub
		Optional<Consultorio> co =consultorioRepository.findById(id);
		if(co.isPresent()) {
			return co.get();
			
		}else {
			throw new ConsultorioExceptions("No se encontro el consultorio con id"+id);
		}
	}

	@Override
	public void updateConsultorio(Consultorio consultorio) {
		// TODO Auto-generated method stub
		consultorioRepository.save(consultorio);
	}

}
