package com.admin.model;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.admin.model.*;

@Entity
@Table(name="demandeur")
public class Demandeur implements Serializable {
//private static final long serialVersionUID = -1244856316278032763L;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private Integer id;
private String nom;
private String sexe;
private boolean morale; 
private String nomdepoux;
private String siren;
private String datene;
private String addne;
private String departemet;
private String pays;
private int numberpersotitulai;
private boolean locationcourte;
private boolean locationlongue;
private String RSSL;
private String SRSSL;
private String nomlocataire;
private String snomlocataire;
private int nvd;
private String extensiond;
private String typevd;
private String nomv;
private String adressed;
private String codepostald;
private String communed;
//@ManyToOne
//private List<Vehicule> vehicule;




public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}



public String getSexe() {
	return sexe;
}
public void setSexe(String sexe) {
	this.sexe = sexe;
}
public boolean isMorale() {
	return morale;
}
public void setMorale(boolean morale) {
	this.morale = morale;
}
public String getNomdepoux() {
	return nomdepoux;
}
public void setNomdepoux(String nomdepoux) {
	this.nomdepoux = nomdepoux;
}
public String getSiren() {
	return siren;
}
public void setSiren(String siren) {
	this.siren = siren;
}
public String getDatene() {
	return datene;
}
public void setDatene(String datene) {
	this.datene = datene;
}
public String getAddne() {
	return addne;
}
public void setAddne(String addne) {
	this.addne = addne;
}
public String getDepartemet() {
	return departemet;
}
public void setDepartemet(String departemet) {
	this.departemet = departemet;
}
public String getPays() {
	return pays;
}
public void setPays(String pays) {
	this.pays = pays;
}
public int getNumberpersotitulai() {
	return numberpersotitulai;
}
public void setNumberpersotitulai(int numberpersotitulai) {
	this.numberpersotitulai = numberpersotitulai;
}
public boolean isLocationcourte() {
	return locationcourte;
}
public void setLocationcourte(boolean locationcourte) {
	this.locationcourte = locationcourte;
}
public boolean isLocationlongue() {
	return locationlongue;
}
public void setLocationlongue(boolean locationlongue) {
	this.locationlongue = locationlongue;
}
public String getRSSL() {
	return RSSL;
}
public void setRSSL(String rSSL) {
	RSSL = rSSL;
}
public String getSRSSL() {
	return SRSSL;
}
public void setSRSSL(String sRSSL) {
	SRSSL = sRSSL;
}
public String getNomlocataire() {
	return nomlocataire;
}
public void setNomlocataire(String nomlocataire) {
	this.nomlocataire = nomlocataire;
}
public String getSnomlocataire() {
	return snomlocataire;
}
public void setSnomlocataire(String snomlocataire) {
	this.snomlocataire = snomlocataire;
}
public int getNvd() {
	return nvd;
}
public void setNvd(int nvd) {
	this.nvd = nvd;
}
public String getExtensiond() {
	return extensiond;
}
public void setExtensiond(String extensiond) {
	this.extensiond = extensiond;
}
public String getTypevd() {
	return typevd;
}
public void setTypevd(String typevd) {
	this.typevd = typevd;
}
public String getNomv() {
	return nomv;
}
public void setNomv(String nomv) {
	this.nomv = nomv;
}
public String getAdressed() {
	return adressed;
}
public void setAdressed(String adressed) {
	this.adressed = adressed;
}
public String getCodepostald() {
	return codepostald;
}
public void setCodepostald(String codepostald) {
	this.codepostald = codepostald;
}
public String getCommuned() {
	return communed;
}
public Demandeur(String nom, String sexe, boolean morale, String nomdepoux, String siren, String datene, String addne,
		String departemet, String pays, int numberpersotitulai, boolean locationcourte, boolean locationlongue,
		String rSSL, String sRSSL, String nomlocataire, String snomlocataire, int nvd, String extensiond, String typevd,
		String nomv, String adressed, String codepostald, String communed) {
	super();
	this.nom = nom;
	this.sexe = sexe;
	this.morale = morale;
	this.nomdepoux = nomdepoux;
	this.siren = siren;
	this.datene = datene;
	this.addne = addne;
	this.departemet = departemet;
	this.pays = pays;
	this.numberpersotitulai = numberpersotitulai;
	this.locationcourte = locationcourte;
	this.locationlongue = locationlongue;
	RSSL = rSSL;
	SRSSL = sRSSL;
	this.nomlocataire = nomlocataire;
	this.snomlocataire = snomlocataire;
	this.nvd = nvd;
	this.extensiond = extensiond;
	this.typevd = typevd;
	this.nomv = nomv;
	this.adressed = adressed;
	this.codepostald = codepostald;
	this.communed = communed;
}
public void setCommuned(String communed) {
	this.communed = communed;
}

public Demandeur() {
	super();
}
@Override
public String toString() {
	return "Demandeur [id=" + id + ", nom=" + nom + ", sexe=" + sexe + ", morale=" + morale + ", nomdepoux=" + nomdepoux
			+ ", siren=" + siren + ", datene=" + datene + ", addne=" + addne + ", departemet=" + departemet + ", pays="
			+ pays + ", numberpersotitulai=" + numberpersotitulai + ", locationcourte=" + locationcourte
			+ ", locationlongue=" + locationlongue + ", RSSL=" + RSSL + ", SRSSL=" + SRSSL + ", nomlocataire="
			+ nomlocataire + ", snomlocataire=" + snomlocataire + ", nvd=" + nvd + ", extensiond=" + extensiond
			+ ", typevd=" + typevd + ", nomv=" + nomv + ", adressed=" + adressed + ", codepostald=" + codepostald
			+ ", communed=" + communed + "]";
}


}
