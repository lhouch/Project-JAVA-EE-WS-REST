package com.admin.dao;

import java.util.Collection;
import java.util.List;

import com.admin.model.Demandeur;

public interface DemandeurDao {
	
	public Boolean addDemandeur(Demandeur d);
	public Demandeur getDemandeurById(long id);
	public List<Demandeur> getAllDemandeur();
	public boolean updateDemandeur(Demandeur d);
	public boolean deleteDemandeur(long id);
	

}
