package tn.nids.remadi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_FORMATION_DETAIL")
public class FormationDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "FD_ID")
	private Long fdId;
	@Column(name = "FD_TABLE_DES_MATIERES")
	private String fdTableDesMatieres;
	@Column(name = "FD_SUPPORT_PDF")
	private String fdSupportPdf;

	@OneToOne(mappedBy = "formationDetail")
	private Formation formation;

	// Properties
	public Long getFdId() {
		return fdId;
	}

	public void setFdId(Long fdId) {
		this.fdId = fdId;
	}

	public String getFdTableDesMatieres() {
		return fdTableDesMatieres;
	}

	public void setFdTableDesMatieres(String fdTableDesMatieres) {
		this.fdTableDesMatieres = fdTableDesMatieres;
	}

	public String getFdSupportPdf() {
		return fdSupportPdf;
	}

	public void setFdSupportPdf(String fdSupportPdf) {
		this.fdSupportPdf = fdSupportPdf;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
