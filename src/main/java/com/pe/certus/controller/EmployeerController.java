package com.pe.certus.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pe.certus.entity.Employeer;
import com.pe.certus.service.EmployeerService;

@Controller
@RequestMapping("/")
public class EmployeerController {

	private final Logger log = LoggerFactory.getLogger(EmployeerController.class);
	
	@Autowired
	private EmployeerService employeerService;
	
	@GetMapping("views/empleado")
	public String listar(Model model) {
		model.addAttribute("empleado", employeerService.listarEmpleado());
		log.info("Objeto lista Empleados"+ employeerService.listarEmpleado());
		return "views/empleado/listar";
	}
	
	@GetMapping("views/empleado/create")
	public String create() {
		return "/views/empleado/create";
	}
	
	@PostMapping("views/empleado/save")
	public String guardar(Employeer employeer, RedirectAttributes attributes) {
		log.info("Create {}", employeer);
		employeerService.crearModificarEmpleado(employeer);
		return "redirect:/views/empleado";
	}
	
	@GetMapping("views/empleado/edit/{id}")
	public String editar(@PathVariable Long id, Model model) {
		Employeer employeer = employeerService.employeerId(id);
		log.info("Objeto recuperado: {}", employeer);
		model.addAttribute("empleado", employeer);
		return "views/empleado/edit";
	}
	
	@GetMapping("views/empleado/delete/{id}")
	public String eliminar(@PathVariable Long id, RedirectAttributes attributes) {
		Employeer employeer = employeerService.employeerId(id);
		log.info("Objeto eliminado: {}", employeer);
		employeerService.eliminarEmpleado(id);
		return "redirect:/views/empleado";
	}
}

