package com.consultorio.start.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.consultorio.start.entity.Cita;
import com.consultorio.start.entity.Consultorio;
import com.consultorio.start.entity.Doctor;
import com.consultorio.start.repository.DoctorRepository;
import com.consultorio.start.service.CitaService;
import com.consultorio.start.service.ConsultorioService;
import com.consultorio.start.service.DoctorService;

import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("cita")
public class CitaController {

	@Autowired
	private CitaService citaService;
	@Autowired
	private ConsultorioService consultorioService;
	@Autowired
	private DoctorService doctorService;

    @GetMapping("/")
	public String showHomePage() {
	       return "doctor";
	}
    @GetMapping("/guardar")
    public String showRegistration(@RequestParam(value = "message",required = false) String message,Model model) {
		List<Consultorio> co = consultorioService.getAllConsultorio();
		List<Doctor> doc = doctorService.getAllDoctor();
		model.addAttribute("consultorios", co);
		model.addAttribute("doctores", doc);
       return "registrarCitaPage";
    }
	@PostMapping("/guardar")
	public String saveCita(@ModelAttribute("cita") Cita cita, Model model ) {
		System.out.println(cita);
		Cita dr =citaService.saveCita(cita);
		model.addAttribute("message","Registro: "+dr+ "guardado");
		return "registrarCitaPage";
	}
	@GetMapping("/obtenercitas")
	public String obtenerCitas(@RequestParam(value = "message",required = false) String message, Model model) {
		List<Cita> ci = citaService.getAllCita();
		model.addAttribute("list", ci);
		model.addAttribute("message", message);
		return "mostrarCitasPage";
	}
	


}
