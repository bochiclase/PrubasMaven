package asignatura.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import pruebasMaven.negocio.AlumnoBean;



@Entity
@Table(name="Asignatura")
public class Asignatura {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column
		private int id;
		
		 
		@Column(name="Asignatura")
		private String asignatura;
		
		@OneToMany(mappedBy = "asignatura")
		private List <AlumnoBean> alumnos = new ArrayList<AlumnoBean>();


		
		
		
		
		
		
		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getAsignatura() {
			return asignatura;
		}


		public void setAsignatura(String asignatura) {
			this.asignatura = asignatura;
		}
		
		
		
}
