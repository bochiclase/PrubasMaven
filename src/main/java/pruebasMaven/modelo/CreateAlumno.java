package pruebasMaven.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pruebasMaven.negocio.AlumnoBean;

public class CreateAlumno {
	

	public void create(AlumnoBean alumno) {
		
		
	
		EntityManager entityManager = Singelton.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(alumno);
		entityManager.getTransaction().commit();
		System.out.println("Entro en alumno");
		
		 
	}

}
