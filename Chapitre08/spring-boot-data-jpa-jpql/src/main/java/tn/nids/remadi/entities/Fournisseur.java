package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TFournisseur")
public class Fournisseur implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFournisseur;
	@Column
	private String codeFournisseur;
	@Column
	private String libelleFournisseur;
	@Enumerated(EnumType.STRING)
	private EnumType categorieFournisseur;

	// Associations
	@OneToOne(mappedBy = "fournisseur")
	private DetailFournisseur detailFournisseur;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fournisseur")
	private Set<Facture> factures;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "fournisseurs")
	private Set<SecteurActivite> secteursActivite;

	// Properties
	public Long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public String getCodeFournisseur() {
		return codeFournisseur;
	}

	public void setCodeFournisseur(String codeFournisseur) {
		this.codeFournisseur = codeFournisseur;
	}

	public String getLibelleFournisseur() {
		return libelleFournisseur;
	}

	public void setLibelleFournisseur(String libelleFournisseur) {
		this.libelleFournisseur = libelleFournisseur;
	}

	public EnumType getCategorieFournisseur() {
		return categorieFournisseur;
	}

	public void setCategorieFournisseur(EnumType categorieFournisseur) {
		this.categorieFournisseur = categorieFournisseur;
	}

	public DetailFournisseur getDetailFournisseur() {
		return detailFournisseur;
	}

	public void setDetailFournisseur(DetailFournisseur detailFournisseur) {
		this.detailFournisseur = detailFournisseur;
	}

	public Set<Facture> getFactures() {
		return factures;
	}

	public void setFactures(Set<Facture> factures) {
		this.factures = factures;
	}

	public Set<SecteurActivite> getSecteursActivite() {
		return secteursActivite;
	}

	public void setSecteursActivite(Set<SecteurActivite> secteursActivite) {
		this.secteursActivite = secteursActivite;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
