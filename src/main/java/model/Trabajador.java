package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="Trabajador")
@NamedQuery(name="Trabajador.findAll", query ="SELECT t FROM Trabajador t")
public class Trabajador {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="dni")
	private String dni;  
	
	@Column(name="codEmpleado")
	private String codEmpleado;
	
	@Column(name="estadoActividad")
	private boolean estadoActividad;

	public Trabajador() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public boolean isEstadoActividad() {
		return estadoActividad;
	}

	public void setEstadoActividad(boolean estadoActividad) {
		this.estadoActividad = estadoActividad;
	}
	
	
	

}
