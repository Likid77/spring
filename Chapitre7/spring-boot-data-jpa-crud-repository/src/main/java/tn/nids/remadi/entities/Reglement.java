package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Reglement implements Serializable {
	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReglement;
	@Column
	private float montantPaye;
	@Column
	private float montantRestant;
	@Column
	private boolean payee;
	@Temporal(TemporalType.DATE)
	private Date dateReglement;
	
	// Associations
	@ManyToOne
	private Facture facture;

	// Properties
	public Long getIdReglement() {
		return idReglement;
	}

	public void setIdReglement(Long idReglement) {
		this.idReglement = idReglement;
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
