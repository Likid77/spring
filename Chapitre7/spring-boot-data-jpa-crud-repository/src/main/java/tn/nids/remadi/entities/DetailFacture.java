package tn.nids.remadi.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class DetailFacture implements Serializable {
	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDetailFacture;
	@Column
	private Integer qteCommandee;
	@Column
	private float prixTotalDetail;
	@Column
	private Integer pourcentageRemise;
	@Column
	private float montantRemise;

	// @ManyToOne
	// private Facture facture;
	// @ManyToOne
	// private Produit produit;

	// Properties
	public Long getIdDetailFacture() {
		return idDetailFacture;
	}

	public void setIdDetailFacture(Long idDetailFacture) {
		this.idDetailFacture = idDetailFacture;
	}

	public Integer getQteCommandee() {
		return qteCommandee;
	}

	public void setQteCommandee(Integer qteCommandee) {
		this.qteCommandee = qteCommandee;
	}

	public float getPrixTotalDetail() {
		return prixTotalDetail;
	}

	public void setPrixTotalDetail(float prixTotalDetail) {
		this.prixTotalDetail = prixTotalDetail;
	}

	public Integer getPourcentageRemise() {
		return pourcentageRemise;
	}

	public void setPourcentageRemise(Integer pourcentageRemise) {
		this.pourcentageRemise = pourcentageRemise;
	}

	public float getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
