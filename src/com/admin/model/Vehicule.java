package com.admin.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Table(name="vehicule")
@Entity
public class Vehicule implements Serializable {
		//private static final long serialVersionUID = -1244856316278032177L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
		private Long id;
		private String numeroMA;		//Numéro d’immatriculation actuel
		private String dateAchat;		//Date d’achat, le cas échéant
		private String dateCertificatA;	//Date de certificat actuel
		private String datePM;			//Date de 1ère immatriculation
		private String numeroFormuleC;	//Numéro de formule du certificat d’immatriculation 
		private String marque;			//Marque (D.1)
		private String typeV;			//Type variante version (D.2)
		private String denominationC;	//Dénomination commerciale (D.3)
		private String numeroIdV;		//Numéro d’identification du véhicule (E)
		private String genreNational;	//Genre national  
		private String numerExp; 		//Numéro d’exploitation agricole, le cas échéant
		private boolean couleurClair;   //COULEUR clair ou Fonce
		private String couleur;			//COULEUR
		@ManyToOne(cascade = {CascadeType.ALL},fetch= FetchType.EAGER)
		private Demandeur demandeur;
		
		
		public Demandeur getDemandeur() {
			return demandeur;
		}
		public void setDemandeur(Demandeur demandeur) {
			this.demandeur = demandeur;
		}
		
		
		public Vehicule(String numeroMA, String dateAchat, String dateCertificatA, String datePM, String numeroFormuleC,
				String marque, String typeV, String denominationC, String numeroIdV, String genreNational,
				String numerExp, boolean couleurClair, String couleur, Demandeur demandeur) {
			super();
			this.numeroMA = numeroMA;
			this.dateAchat = dateAchat;
			this.dateCertificatA = dateCertificatA;
			this.datePM = datePM;
			this.numeroFormuleC = numeroFormuleC;
			this.marque = marque;
			this.typeV = typeV;
			this.denominationC = denominationC;
			this.numeroIdV = numeroIdV;
			this.genreNational = genreNational;
			this.numerExp = numerExp;
			this.couleurClair = couleurClair;
			this.couleur = couleur;
			this.demandeur = demandeur;
		}
		public Vehicule() {
			super();
		}
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNumeroMA() {
			return numeroMA;
		}
		public void setNumeroMA(String numeroMA) {
			this.numeroMA = numeroMA;
		}
		public String getDateAchat() {
			return dateAchat;
		}
		public void setDateAchat(String dateAchat) {
			this.dateAchat = dateAchat;
		}
		public String getDateCertificatA() {
			return dateCertificatA;
		}
		public void setDateCertificatA(String dateCertificatA) {
			this.dateCertificatA = dateCertificatA;
		}
		public String getDatePM() {
			return datePM;
		}
		public void setDatePM(String datePM) {
			this.datePM = datePM;
		}
		public String getNumeroFormuleC() {
			return numeroFormuleC;
		}
		public void setNumeroFormuleC(String numeroFormuleC) {
			this.numeroFormuleC = numeroFormuleC;
		}
		public String getMarque() {
			return marque;
		}
		public void setMarque(String marque) {
			this.marque = marque;
		}
		public String getTypeV() {
			return typeV;
		}
		public void setTypeV(String typeV) {
			this.typeV = typeV;
		}
		public String getDenominationC() {
			return denominationC;
		}
		public void setDenominationC(String denominationC) {
			this.denominationC = denominationC;
		}
		public String getNumeroIdV() {
			return numeroIdV;
		}
		public void setNumeroIdV(String numeroIdV) {
			this.numeroIdV = numeroIdV;
		}
		public String getGenreNational() {
			return genreNational;
		}
		public void setGenreNational(String genreNational) {
			this.genreNational = genreNational;
		}
		public String getNumerExp() {
			return numerExp;
		}
		public void setNumerExp(String numerExp) {
			this.numerExp = numerExp;
		}
		public boolean isCouleurClair() {
			return couleurClair;
		}
		public void setCouleurClair(boolean couleurClair) {
			this.couleurClair = couleurClair;
		}
		public String getCouleur() {
			return couleur;
		}
		public void setCouleur(String couleur) {
			this.couleur = couleur;
		}
		@Override
		public String toString() {
			return "Vehicule [id=" + id + ", numeroMA=" + numeroMA + ", dateAchat=" + dateAchat + ", dateCertificatA="
					+ dateCertificatA + ", datePM=" + datePM + ", numeroFormuleC=" + numeroFormuleC + ", marque="
					+ marque + ", typeV=" + typeV + ", denominationC=" + denominationC + ", numeroIdV=" + numeroIdV
					+ ", genreNational=" + genreNational + ", numerExp=" + numerExp + ", couleurClair=" + couleurClair
					+ ", couleur=" + couleur + ", demandeur=" + demandeur + "]";
		}
		
		
}
