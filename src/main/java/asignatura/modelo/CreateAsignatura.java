package asignatura.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import asignatura.beans.Asignatura;
import pruebasMaven.modelo.Singelton;
import pruebasMaven.negocio.AlumnoBean;

public class CreateAsignatura {
public void create(Asignatura asignatura) {
		
	    EntityManager entityManager = Singelton.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(asignatura);
		entityManager.getTransaction().commit();
		System.out.print("Accede aqui");
		
		 
	}
}
