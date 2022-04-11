package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Operateur implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOperateur;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String password;

	// Associations
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Facture> factures;

	// Properties
	public Long getIdOperateur() {
		return idOperateur;
	}

	public void setIdOperateur(Long idOperateur) {
		this.idOperateur = idOperateur;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
