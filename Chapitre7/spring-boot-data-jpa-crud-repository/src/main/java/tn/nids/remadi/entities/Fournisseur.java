package tn.nids.remadi.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
