package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Facture implements Serializable {
	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFacture;
	@Column
	private float montantRemise;
	@Column
	private float montantFacture;
	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	@Column
	private Boolean active;

	@ManyToOne
	private Client client;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facture")
	private Set<DetailFacture> detailsFacture;

	// Properties
	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public float getMontantRemise() {
		return montantRemise;
	}

	public void setMontantRemise(float montantRemise) {
		this.montantRemise = montantRemise;
	}

	public float getMontantFacture() {
		return montantFacture;
	}

	public void setMontantFacture(float montantFacture) {
		this.montantFacture = montantFacture;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<DetailFacture> getDetailsFacture() {
		return detailsFacture;
	}

	public void setDetailsFacture(Set<DetailFacture> detailsFacture) {
		this.detailsFacture = detailsFacture;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

