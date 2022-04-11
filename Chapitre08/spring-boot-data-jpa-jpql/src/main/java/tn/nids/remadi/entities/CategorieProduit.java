package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
public class CategorieProduit implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorieProduit;
	@Column
	private String codeCategorieProduit;
	@Column
	private String libelleCategorieProduit;

	// Associations
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categorieProduit")
	private Set<Produit> produits;
	// Properties

	public Long getIdCategorieProduit() {
		return idCategorieProduit;
	}

	public void setIdCategorieProduit(Long idCategorieProduit) {
		this.idCategorieProduit = idCategorieProduit;
	}

	public String getCodeCategorieProduit() {
		return codeCategorieProduit;
	}

	public void setCodeCategorieProduit(String codeCategorieProduit) {
		this.codeCategorieProduit = codeCategorieProduit;
	}

	public String getLibelleCategorieProduit() {
		return libelleCategorieProduit;
	}

	public void setLibelleCategorieProduit(String libelleCategorieProduit) {
		this.libelleCategorieProduit = libelleCategorieProduit;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
