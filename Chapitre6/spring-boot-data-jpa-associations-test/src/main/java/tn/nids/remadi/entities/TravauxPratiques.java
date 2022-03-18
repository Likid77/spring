package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_TP")
public class TravauxPratiques implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TP_ID")
	private Long tpId;
	@Column(name = "TP_SUJET")
	private String tpSujet;
	@Column(name = "TP_DUREE")
	private Long tpDuree;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "travauxPratiques")
	private Set<TpCorrection> tpCorrections;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "formationTps")
	private Set<Formation> formations;

	// Properties
	public Long getTpId() {
		return tpId;
	}

	public void setTpId(Long tpId) {
		this.tpId = tpId;
	}

	public String getTpSujet() {
		return tpSujet;
	}

	public void setTpSujet(String tpSujet) {
		this.tpSujet = tpSujet;
	}

	public Long getTpDuree() {
		return tpDuree;
	}

	public void setTpDuree(Long tpDuree) {
		this.tpDuree = tpDuree;
	}

	public Set<TpCorrection> getTpCorrections() {
		return tpCorrections;
	}

	public void setTpCorrections(Set<TpCorrection> tpCorrections) {
		this.tpCorrections = tpCorrections;
	}

	public Set<Formation> getFormations() {
		return formations;
	}

	public void setFormations(Set<Formation> formations) {
		this.formations = formations;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
