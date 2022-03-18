package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
public class DetailFournisseur implements Serializable {
	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetailFournisseur;
	@Temporal(TemporalType.DATE)
	private Date dateDebutCollaboration;
	@Column
	private String adresse;
	@Column
	private String matricule;
	// @OneToOne(mappedBy = "detailProduit")
	// private Produit produit;

	// Properties
	public Long getIdDetailFournisseur() {
		return idDetailFournisseur;
	}

	public void setIdDetailFournisseur(Long idDetailFournisseur) {
		this.idDetailFournisseur = idDetailFournisseur;
	}

	public Date getDateDebutCollaboration() {
		return dateDebutCollaboration;
	}

	public void setDateDebutCollaboration(Date dateDebutCollaboration) {
		this.dateDebutCollaboration = dateDebutCollaboration;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
