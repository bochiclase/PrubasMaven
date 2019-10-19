package asignatura.beans;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Asignatura {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column
		private int id;
		
		 
		@Column(name="Asignatura")
		private String asignatura;


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
