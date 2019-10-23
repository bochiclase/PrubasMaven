package pruebasMaven.negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import asignatura.beans.Asignatura;

@Entity
@Table(name="alumno")
public class AlumnoBean {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long id;

	@Column(name="nombre")
	private String nombre;
	
	@Column(name="telefono")
	private String telefono;
	
	
	@ManyToOne
	
	private Asignatura asignatura;
	
	
	
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
}
