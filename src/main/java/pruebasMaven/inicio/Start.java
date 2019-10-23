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
	
		
		AlumnoBean alumno2 = new AlumnoBean();
		alumno2.setNombre("Adrian");
		alumno2.setTelefono("123123123");
		
		
		CreateAlumno meter_en_DB = new CreateAlumno();
		meter_en_DB.create(alumno);
		meter_en_DB.create(alumno2);
		
		
		Asignatura asig = new Asignatura();
		asig.setAsignatura("Matematicas");
		
		Asignatura asig2 = new Asignatura();
		asig2.setAsignatura("Lengua");
		
		Asignatura asig3 = new Asignatura();
		asig3.setAsignatura("Filosofia");
		
		Asignatura asig4 = new Asignatura();
		asig4.setAsignatura("Naturales");
		
		
		CreateAsignatura createAsig = new CreateAsignatura();
		createAsig.create(asig);
		createAsig.create(asig2);
		createAsig.create(asig3);
		createAsig.create(asig4);
		
		
	}

}
