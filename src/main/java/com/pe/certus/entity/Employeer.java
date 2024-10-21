package com.pe.certus.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Employeer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="chr_emplcodigo")
	private Long id;
	
	@Column(name="vch_emplpaterno")
	private String paterno;
	
	@Column(name="vch_emplmaterno")
	private String materno;
	
	@Column(name="vch_emplnombre")
	private String nombre;
	
	@Column(name="vch_emplusuario")
	private String usuario;
	
	@Column(name="vch_emplclave")
	private String clave;
	
	@Column(name="chr_emplestado")
	private boolean estado;
	
	@Column(name="chr_emplfoto", length = 8)
	private String foto;

	public Employeer() {
		super();
	}

	public Employeer(Long id, String paterno, String materno, String nombre, String usuario, String clave,
			boolean estado, String foto) {
		super();
		this.id = id;
		this.paterno = paterno;
		this.materno = materno;
		this.nombre = nombre;
		this.usuario = usuario;
		this.clave = clave;
		this.estado = estado;
		this.foto = foto;
	}

	

	@Override
	public String toString() {
		return "Employeer [id=" + id + ", paterno=" + paterno + ", materno=" + materno + ", nombre=" + nombre
				+ ", usuario=" + usuario + ", clave=" + clave + ", estado=" + estado + ", foto=" + foto + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	
}
