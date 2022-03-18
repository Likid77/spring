package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Facture implements Serializable {
	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFacture;
	@Column
	private float montantPaye;
	@Column
	private float montantRestant;
	@Column
	private boolean payee;
	@Temporal(TemporalType.DATE)
	private Date dateReglement;
	
	// Associations
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facture")
	private Set<Reglement> reglements;

	// @ManyToOne
	// private Client client;
	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "facture")
	// private Set<DetailFacture> detailsFacture;

	// Properties
	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public float getMontantPaye() {
		return montantPaye;
	}

	public void setMontantPaye(float montantPaye) {
		this.montantPaye = montantPaye;
	}

	public float getMontantRestant() {
		return montantRestant;
	}

	public void setMontantRestant(float montantRestant) {
		this.montantRestant = montantRestant;
	}

	public boolean isPayee() {
		return payee;
	}

	public void setPayee(boolean payee) {
		this.payee = payee;
	}

	public Date getDateReglement() {
		return dateReglement;
	}

	public void setDateReglement(Date dateReglement) {
		this.dateReglement = dateReglement;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
