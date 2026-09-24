package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name="rol")
@NamedQuery(name="Rol.findAll", query ="SELECT r FROM Rol r")
public class Rol {
	
	@Id
	@Column(name="idRol")
	private int idRol;

	@Column(name="rolName")
	private String rolName;
	
	@Column(name="rolStatus")
	private int rolStatus;

	public Rol() {
	}

	public int getId() {
		return idRol;
	}

	public void setId(int id) {
		this.idRol = id;
	}

	public String getRolName() {
		return rolName;
	}

	public void setRolName(String rolName) {
		this.rolName = rolName;
	}

	public int getRolStatus() {
		return rolStatus;
	}

	public void setRolStatus(int rolStatus) {
		this.rolStatus = rolStatus;
	}
	
	
}
