package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Stock implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idStock;
	@Column
	private Integer qte;
	@Column
	private Integer qteMin;
	@Column
	private String libelleStock;

	// Associations
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "stock")
	private Set<Produit> produits;

	// Properties
	public Long getIdStock() {
		return idStock;
	}

	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}

	public Integer getQte() {
		return qte;
	}

	public void setQte(Integer qte) {
		this.qte = qte;
	}

	public Integer getQteMin() {
		return qteMin;
	}

	public void setQteMin(Integer qteMin) {
		this.qteMin = qteMin;
	}

	public String getLibelleStock() {
		return libelleStock;
	}

	public void setLibelleStock(String libelleStock) {
		this.libelleStock = libelleStock;
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
