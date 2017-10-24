package com.admin.service;


import java.util.Collection;
import java.util.List;

import com.admin.dao.DemandeurDaoImpl;
import com.admin.model.Demandeur;
import com.google.gson.Gson;

public class DemandeurService {
	
	public DemandeurService(){}
	
	DemandeurDaoImpl dd = new DemandeurDaoImpl();

	public Boolean addDemandeur(Demandeur d){
		
		return dd.addDemandeur(d);
	}
	
	
	
	
	public Demandeur getDemandeuById(long id){
		
		return dd.getDemandeurById(id);
	}
	
	public String getAllDemandeur(){
		String json = new Gson().toJson(dd.getAllDemandeur());
		
		return json;
	}
	
	public boolean updateDemandeur(Demandeur d){
		
		return dd.updateDemandeur(d);
	}
	
	public boolean deleteDemandeur(long id){
		
		return dd.deleteDemandeur(id);
	}

}
