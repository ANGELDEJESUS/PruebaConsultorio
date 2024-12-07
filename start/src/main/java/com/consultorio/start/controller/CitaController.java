package com.consultorio.start.controller;

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
import com.consultorio.start.service.CitaService;

@Controller
@RequestMapping("cita")
public class CitaController {

	@Autowired
	private CitaService CitaService;
    @GetMapping("/")
	public String showHomePage() {
	       return "doctor";
	}
    @GetMapping("/guardar")
    public String showRegistration() {
       return "registrarCitaPage";
    }
	@PostMapping("/guardar")
	public String saveCita(@ModelAttribute("cita") Cita cita, Model model ) {
		System.out.println(cita);
		Cita dr =CitaService.saveCita(cita);
		model.addAttribute("message","Registro: "+dr+ "guardado");
		return "registrarCitaPage";
	}
}
