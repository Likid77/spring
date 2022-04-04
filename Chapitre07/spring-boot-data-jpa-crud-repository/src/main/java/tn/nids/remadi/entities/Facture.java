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
	private float montantRemise;
	@Column
	private float montantFacture;
	@Temporal(TemporalType.DATE)
	private Date dateCreationFacture;
	@Temporal(TemporalType.DATE)
	private Date dateDerniereModification;
	@Column
	private boolean archivee;

	// Associations
	@ManyToOne
	private Fournisseur fournisseur;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facture")
	private Set<DetailFacture> detailsFacture;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facture")
	private Set<Reglement> reglements;

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

	public Date getDateCreationFacture() {
		return dateCreationFacture;
	}

	public void setDateCreationFacture(Date dateCreationFacture) {
		this.dateCreationFacture = dateCreationFacture;
	}

	public Date getDateDerniereModification() {
		return dateDerniereModification;
	}

	public void setDateDerniereModification(Date dateDerniereModification) {
		this.dateDerniereModification = dateDerniereModification;
	}

	public boolean isArchivee() {
		return archivee;
	}

	public void setArchivee(boolean archivee) {
		this.archivee = archivee;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public Set<DetailFacture> getDetailsFacture() {
		return detailsFacture;
	}

	public void setDetailsFacture(Set<DetailFacture> detailsFacture) {
		this.detailsFacture = detailsFacture;
	}

	public Set<Reglement> getReglements() {
		return reglements;
	}

	public void setReglements(Set<Reglement> reglements) {
		this.reglements = reglements;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
