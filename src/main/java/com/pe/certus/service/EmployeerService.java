package com.pe.certus.service;

import java.util.List;

import com.pe.certus.entity.Employeer;

public interface EmployeerService {

	public List<Employeer> listarEmpleado();
	public Employeer employeerId(Long id);
	public void crearModificarEmpleado(Employeer employeer);
	public void eliminarEmpleado(Long id);

}
