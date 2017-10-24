package com.admin.service;

import com.admin.dao.VehiculeDaoImpl;
import com.admin.model.Vehicule;
import com.google.gson.Gson;

public class VehiculeService {
	
	VehiculeDaoImpl vdi = new VehiculeDaoImpl();
	
	public VehiculeService(){
		
	}
	
	public boolean addVehicule(Vehicule v){
		vdi.addVehicule(v);
		return true;
	}
	public String getAllVehicule(){
		String json = new Gson().toJson(vdi.getAllVehicule());
		return json;
	}
	public boolean updateVehicule(Vehicule v){
		vdi.updateVehicule(v);
		return true;
		
	}
	public boolean deleteVehicule(long id){
		vdi.deleteVehiclule(id);
		return true;
	}

}
