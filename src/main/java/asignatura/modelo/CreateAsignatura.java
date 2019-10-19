package asignatura.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import asignatura.beans.Asignatura;
import pruebasMaven.negocio.AlumnoBean;

public class CreateAsignatura {
public void create(Asignatura asignatura) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.marcos.pruebasMaven.H2");
		EntityManager entityManager = emf.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(asignatura);
		entityManager.getTransaction().commit();
		entityManager.close();		
		
		
	}
}
