package com.admin.dao;

import java.util.List;

import com.admin.model.Demandeur;
import com.admin.model.Vehicule;

public interface VehiculeDao {
	public Boolean addVehicule(Vehicule v);
	public Vehicule getVehiculeById(long id);
	public List<Vehicule> getAllVehicule();
	public boolean updateVehicule(Vehicule v);
	public boolean deleteVehiclule(long id);

}
