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

import com.consultorio.start.entity.Consultorio;
import com.consultorio.start.service.ConsultorioService;

@Controller
@RequestMapping("consultorio")
public class ConsultorioController {

	@Autowired
	private ConsultorioService consultorioService;
    @GetMapping("/")
	public String showHomePage() {
	       return "doctor";
	}
    @GetMapping("/guardar")
    public String showRegistration() {
       return "registrarConsultorioPage";
    }
	@PostMapping("/guardar")
	public String saveConsultorio(@ModelAttribute("consultorio") Consultorio consultorio, Model model ) {
		System.out.println(consultorio);
		Consultorio co =consultorioService.saveConsultorio(consultorio);
		model.addAttribute("message","Registro: "+co+ "guardado");
		return "registrarConsultorioPage";
	}
}
