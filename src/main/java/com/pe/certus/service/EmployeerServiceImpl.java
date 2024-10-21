package com.pe.certus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pe.certus.entity.Employeer;
import com.pe.certus.repository.EmployeerRepository;

@Service
public class EmployeerServiceImpl implements EmployeerService {

	@Autowired
	private EmployeerRepository employeerRepository;
	
	@Override
	public List<Employeer> listarEmpleado(){
		return employeerRepository.findAll();
	}
	
	@Override
	public Employeer employeerId(Long id){
		return employeerRepository.findById(id).orElse(null);
	}
	
	@Override
	public void crearModificarEmpleado(Employeer employeer) {
		Employeer emp = new Employeer();
		emp.setId(employeer.getId());
		emp.setPaterno(employeer.getPaterno());
		emp.setMaterno(employeer.getMaterno());
		emp.setNombre(employeer.getNombre());
		emp.setUsuario(employeer.getUsuario());
		emp.setClave(employeer.getClave());
		if(employeer.isEstado()) {
			emp.setEstado(true);
		}else {
			emp.setEstado(employeer.isEstado());
		}
		employeerRepository.save(emp);
	}
	
	@Override
	public void eliminarEmpleado(Long id) {
		employeerRepository.deleteById(id);
	}
	
	
}
