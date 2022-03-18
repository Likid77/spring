package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Produit implements Serializable {
	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProduit;
	@Column
	private String codeProduit;
	@Column
	private String libelleProduit;
	@Column
	private float prix;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	@Temporal(TemporalType.DATE)
	private Date dateDerniereModification;
	// @OneToOne
	// private DetailProduit detailProduit;
	// @ManyToMany(cascade = CascadeType.ALL)
	// private Set<Fournisseur> fournisseurs;
	// @ManyToOne
	// private Rayon rayon;
	// @ManyToOne
	// private Stock stock;
	// @OneToMany(cascade=CascadeType.ALL, mappedBy = "produit")
	// private Set<DetailFacture> detailFactures;

	// Properties
	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public String getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}

	public String getLibelleProduit() {
		return libelleProduit;
	}

	public void setLibelleProduit(String libelleProduit) {
		this.libelleProduit = libelleProduit;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}

	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
