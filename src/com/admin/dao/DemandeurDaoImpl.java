package com.admin.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.admin.con.ConnectionDB;
import com.admin.model.Demandeur;
import com.mysql.jdbc.ResultSetImpl;

public class DemandeurDaoImpl implements DemandeurDao{
	
	List<Demandeur> list;
	
	private static EntityManager em;
	
	
	
	public DemandeurDaoImpl() {
		list = new ArrayList<>(); 
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("adminEm");
		em = emf.createEntityManager();
	}

	@Override
	public Boolean addDemandeur(Demandeur d) {
		ConnectionDB connectionDB = new ConnectionDB();
		String sql = "INSERT INTO demandeur (id,nom, RSSL, SRSSL, addne, adressed,codepostald,communed,datene,departemet,extensiond,locationcourte,locationlongue,morale,nomdepoux,nomlocataire,nomv,numberpersotitulai,nvd,pays,sexe,siren,snomlocataire,typevd) "
				+ "VALUES (null, '"+d.getNom()+"', '"+d.getRSSL()+"','"+d.getAddne()+"','"+d.getAdressed()+"','"+d.getCodepostald()+"','"+d.getCommuned()+"','"+d.getDatene()+"','"+d.getDepartemet()+"','"+d.getDepartemet()+"','"+d.getExtensiond()+"',"+d.isLocationcourte()+","+d.isLocationlongue()+","+d.isMorale()+",'"+d.getNomdepoux()+"','"+d.getNomlocataire()+"','"+d.getNomv()+"',"+d.getNumberpersotitulai()+","+d.getNvd()+","
						+ "'"+d.getPays()+"','"+d.getSexe()+"','"+d.getSiren()+"','"+d.getSnomlocataire()+"','"+d.getTypevd()+"' )";
		try {
			int res= connectionDB.stmt.executeUpdate(sql,connectionDB.stmt.RETURN_GENERATED_KEYS);
			connectionDB.rs = connectionDB.stmt.getGeneratedKeys();
			connectionDB.rs.next();
			System.out.println("id @@@ "+connectionDB.rs.getInt(1));
			connectionDB.stmt.close();
			connectionDB.con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return true;
		
	}

	@Override
	public Demandeur getDemandeurById(long id) {
		Demandeur demandeur = new Demandeur();
		ConnectionDB cdb = new ConnectionDB();
		String sql = "SELECT * FROM demandeur WHERE id="+id;
		try {
			cdb.rs= (ResultSetImpl) cdb.stmt.executeQuery(sql);
			while(cdb.rs.next()){
				demandeur.setId(cdb.rs.getInt(0));demandeur.setNom(cdb.rs.getString(1));demandeur.setRSSL(cdb.rs.getString(2));demandeur.setSRSSL(cdb.rs.getString(3));
				demandeur.setAddne(cdb.rs.getString(4));demandeur.setAdressed(cdb.rs.getString(5));
			} 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return demandeur;
	}

	@Override
	public List<Demandeur> getAllDemandeur() {
		
		em.getTransaction().begin();
		Query query = em.createQuery("select d from Demandeur d", Demandeur.class);
		List<Demandeur> list =(List<Demandeur>)  query.getResultList();
		em.getTransaction().commit();
		return list ;
	}

	@Override
	public boolean updateDemandeur(Demandeur d) {
		em.getTransaction().begin();
		Demandeur df = (Demandeur) em.find(Demandeur.class, d.getId());
		df.setNom(d.getNom());
		em.getTransaction().commit();
		return true;
	}

	@Override
	public boolean deleteDemandeur(long id) {
		
		Demandeur d = findDemandeur(id);
		
		if(d != null) {
			em.getTransaction().begin();
			em.remove(d);
		em.getTransaction().commit();
		return true;}
		return false;
	}
	public Demandeur findDemandeur(long id){
		return em.find(Demandeur.class, id);
	}

}
