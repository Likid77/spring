package tn.nids.remadi.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class CategorieProduit implements Serializable {
	private static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategorieProduit;
	@Column
	private String codeCategorieProduit;
	@Column
	private String lbelleCategorieProduit;

	// Properties
	public Long getIdCategorieProduit() {
		return idCategorieProduit;
	}

	public void setIdCategorieProduit(Long idCategorieProduit) {
		this.idCategorieProduit = idCategorieProduit;
	}

	public String getCodeCategorieProduit() {
		return codeCategorieProduit;
	}

	public void setCodeCategorieProduit(String codeCategorieProduit) {
		this.codeCategorieProduit = codeCategorieProduit;
	}

	public String getLbelleCategorieProduit() {
		return lbelleCategorieProduit;
	}

	public void setLbelleCategorieProduit(String lbelleCategorieProduit) {
		this.lbelleCategorieProduit = lbelleCategorieProduit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
