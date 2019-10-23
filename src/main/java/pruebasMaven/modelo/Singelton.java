package pruebasMaven.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Singelton {
	
	private static EntityManager emf = null;

	
	private Singelton() {
		EntityManagerFactory p =Persistence.createEntityManagerFactory("com.marcos.pruebasMaven.H2DataBase");
		emf = p.createEntityManager();
	}
	
	
	
	public static EntityManager getEntityManager() { 
		
		if (emf == null) {
			new Singelton();
		}
		return emf;
	}
}
