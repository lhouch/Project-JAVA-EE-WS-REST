package com.admin.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.admin.model.Demandeur;
import com.admin.model.Vehicule;

public class VehiculeDaoImpl implements VehiculeDao{

	List<Vehicule> list;
	
	private static EntityManager em;
	
	
	
	public VehiculeDaoImpl() {
		list = new ArrayList<>(); 
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("adminEm");
		em = emf.createEntityManager();
	}

	@Override
	public Boolean addVehicule(Vehicule v) {
		em.getTransaction().begin();
		//v.setId(null);
		em.persist(v);
		em.getTransaction().commit();
		return true;
	}

	@Override
	public Vehicule getVehiculeById(long id) {
		
		return findVehicule(id);
	}

	@Override
	public List<Vehicule> getAllVehicule() {
		em.getTransaction().begin();
		Query query = em.createQuery("select v from Vehicule v", Vehicule.class);
		List<Vehicule> list =(List<Vehicule>)  query.getResultList();
		em.getTransaction().commit();
		return list ;
	}

	@Override
	public boolean updateVehicule(Vehicule v) {
		em.getTransaction().begin();
		Vehicule df = (Vehicule) em.find(Vehicule.class, v.getId());
		df = v;
		em.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteVehiclule(long id) {
		Vehicule v = findVehicule(id);
		
		if(v != null) {
			em.getTransaction().begin();
			em.remove(v);
		em.getTransaction().commit();
		return true;}
		return false;
	}
	public Vehicule findVehicule(long id){
		return em.find(Vehicule.class, id);
	}

}
