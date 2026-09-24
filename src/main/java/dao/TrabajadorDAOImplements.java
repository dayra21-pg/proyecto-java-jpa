package dao;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import model.Trabajador;

public class TrabajadorDAOImplements implements TrabajadorDAO {
	
	EntityManagerFactory fabric;
	EntityManager em;
	public TrabajadorDAOImplements() {
		fabric=Persistence.createEntityManagerFactory("Semana01");
		em= fabric.createEntityManager();
	}

	@Override
	public void create(Trabajador trabajador) {
		try {
			em.getTransaction().begin();
			em.persist(trabajador);
			em.getTransaction().commit();
		}catch(NullPointerException e) {
			em.getTransaction().rollback();
		}
		
	}

	@Override
	public void edit(Trabajador trabajador) {
	    try {
	        em.getTransaction().begin();
	        em.merge(trabajador);
	        em.getTransaction().commit();
	    } catch (Exception e) {
	        if (em.getTransaction().isActive()) {
	            em.getTransaction().rollback();
	        }
	    }
	}



	@Override
	public void delete(int id) {
		try {
			em.getTransaction().begin();
			em.remove(id);
			em.getTransaction().commit();
		}catch(NullPointerException e) {
			em.getTransaction().rollback();
		}	
		
	}

	@Override
	public Trabajador find(int id) {
		return em.find(Trabajador.class, id);
	}

	@Override
	public List<Trabajador> findAll() {
		Query query= em.createNamedQuery("Trabajador.findAll");
		List<Trabajador> lista;
		try {
			lista= query.getResultList();
		}catch(Exception e) {
			lista= null;
		}
		return lista;
	}
	}
