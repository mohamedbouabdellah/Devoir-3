package com.mohamed.phones.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;



@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPhone;
    private String nomPhone;
    private Double prixPhone;
    private Date dateCreation;
    
    @ManyToOne
    private Categorie categorie ;
    
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	public Phone(String nomPhone, Double prixPhone, Date dateCreation) {
		super();
		this.nomPhone = nomPhone;
		this.prixPhone = prixPhone;
		this.dateCreation = dateCreation;
	}





	@Override
	public String toString() {
		return "Phone [idPhone=" + idPhone + ", nomPhone=" + nomPhone + ", prixPhone=" + prixPhone + ", dateCreation="
				+ dateCreation + "]";
	}





	public Long getIdPhone() {
		return idPhone;
	}
	public void setIdPhone(Long idPhone) {
		this.idPhone = idPhone;
	}
	public String getNomPhone() {
		return nomPhone;
	}
	public void setNomPhone(String nomPhone) {
		this.nomPhone = nomPhone;
	}
	public Double getPrixPhone() {
		return prixPhone;
	}
	public void setPrixPhone(Double prixPhone) {
		this.prixPhone = prixPhone;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}





	public Categorie getCategorie() {
		return categorie;
	}





	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
