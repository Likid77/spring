package tn.nids.remadi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_TP_CORRECTION")
public class TpCorrection implements Serializable {
	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TC_ID")
	private Long tcId;
	@Column(name = "TC_CORRECTION")
	private String tcCorrection;

	@ManyToOne
	TravauxPratiques travauxPratiques;

	// Properties
	public Long getTcId() {
		return tcId;
	}

	public void setTcId(Long tcId) {
		this.tcId = tcId;
	}

	public String getTcCorrection() {
		return tcCorrection;
	}

	public void setTcCorrection(String tcCorrection) {
		this.tcCorrection = tcCorrection;
	}

	public TravauxPratiques getTravauxPratiques() {
		return travauxPratiques;
	}

	public void setTravauxPratiques(TravauxPratiques travauxPratiques) {
		this.travauxPratiques = travauxPratiques;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
