package tn.nids.remadi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rayon implements Serializable {
	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRayon;
	@Column
	private String codeRayon;
	@Column
	private String libelleRayon;

	// Properties
	public Long getIdRayon() {
		return idRayon;
	}

	public void setIdRayon(Long idRayon) {
		this.idRayon = idRayon;
	}

	public String getCodeRayon() {
		return codeRayon;
	}

	public void setCodeRayon(String codeRayon) {
		this.codeRayon = codeRayon;
	}

	public String getLibelleRayon() {
		return libelleRayon;
	}

	public void setLibelleRayon(String libelleRayon) {
		this.libelleRayon = libelleRayon;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
