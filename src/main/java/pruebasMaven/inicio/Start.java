package pruebasMaven.inicio;


import asignatura.beans.Asignatura;
import asignatura.modelo.CreateAsignatura;
import pruebasMaven.modelo.CreateAlumno;
import pruebasMaven.negocio.AlumnoBean;

public class Start {

	public static void main(String[] args) {
		
		AlumnoBean alumno = new AlumnoBean();
		alumno.setNombre("Marcos");
		alumno.setTelefono("666555444333");
		
		CreateAlumno meter_en_DB = new CreateAlumno();
		meter_en_DB.create(alumno);
		
		/*
		AlumnoBean alumno2 = new AlumnoBean();
		alumno2.setNombre("Bocheti");
		alumno2.setTelefono("123123123");
		
		
		meter_en_DB.create(alumno);
		*/
		
		
		
		
		
		Asignatura asig = new Asignatura();
		asig.setAsignatura("Matematicas");
		
		
		CreateAsignatura createAsig = new CreateAsignatura();
		createAsig.create(asig);
	}

}
