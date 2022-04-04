package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Client implements Serializable {
	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	@Column
	private String email;
	@Column
	private String password;
	@Enumerated(EnumType.STRING)
	private EnumType categorieClient;
	@Enumerated(EnumType.STRING)
	private EnumType profession;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
	private Set<Facture> factures;

	// Properties
	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public EnumType getCategorieClient() {
		return categorieClient;
	}

	public void setCategorieClient(EnumType categorieClient) {
		this.categorieClient = categorieClient;
	}

	public EnumType getProfession() {
		return profession;
	}

	public void setProfession(EnumType profession) {
		this.profession = profession;
	}

	public Set<Facture> getFactures() {
		return factures;
	}

	public void setFactures(Set<Facture> factures) {
		this.factures = factures;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

