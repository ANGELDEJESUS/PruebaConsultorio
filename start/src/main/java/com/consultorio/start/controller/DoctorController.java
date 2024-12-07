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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consultorio.start.entity.Doctor;
import com.consultorio.start.service.DoctorService;

@Controller
@RequestMapping("doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorService;
    @GetMapping("/")
	public String showHomePage() {
	       return "doctor";
	}
    @GetMapping("/guardar")
    public String showRegistration() {
       return "registrarDoctorPage";
    }
	@PostMapping("/guardar")
	public String saveDoctor(@ModelAttribute("doctor") Doctor doctor, Model model ) {
		System.out.println(doctor);
		Doctor dr =doctorService.saveDoctor(doctor);
		model.addAttribute("message","Registro: "+dr+ "guardado");
		return "registrarDoctorPage";
	}
	 @GetMapping("/obtenerDoctores")
	    public String getAllInvoices(
	            @RequestParam(value = "message", required = false) String message,
	            Model model
	            ) {
	       List<Doctor> doctores= doctorService.getAllDoctor();
	       model.addAttribute("list", doctores);
	       model.addAttribute("message", message);
	       System.out.println(doctores);

	       return "mostrarDoctoresPage";
	    }
}
