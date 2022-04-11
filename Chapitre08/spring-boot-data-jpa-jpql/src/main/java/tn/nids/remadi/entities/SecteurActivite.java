package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;

@Entity
public class SecteurActivite implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSecteurActivite;
	@Column
	private String codeSecteurActivite;
	@Column
	private String libelleSecteurActivite;

	// Associations
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Fournisseur> fournisseurs;

	// Properties
	public Long getIdSecteurActivite() {
		return idSecteurActivite;
	}

	public void setIdSecteurActivite(Long idSecteurActivite) {
		this.idSecteurActivite = idSecteurActivite;
	}

	public String getCodeSecteurActivite() {
		return codeSecteurActivite;
	}

	public void setCodeSecteurActivite(String codeSecteurActivite) {
		this.codeSecteurActivite = codeSecteurActivite;
	}

	public String getLibelleSecteurActivite() {
		return libelleSecteurActivite;
	}

	public void setLibelleSecteurActivite(String libelleSecteurActivite) {
		this.libelleSecteurActivite = libelleSecteurActivite;
	}

	public Set<Fournisseur> getFournisseurs() {
		return fournisseurs;
	}

	public void setFournisseurs(Set<Fournisseur> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
