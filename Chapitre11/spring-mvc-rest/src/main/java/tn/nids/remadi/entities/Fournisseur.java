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

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "TFournisseur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Fournisseur implements Serializable {

	static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idFournisseur;
	@Column
	String codeFournisseur;
	@Column
	String libelleFournisseur;
	@Enumerated(EnumType.STRING)
	EnumType categorieFournisseur;

	// Associations
	@OneToOne(mappedBy = "fournisseur")
	DetailFournisseur detailFournisseur;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "fournisseur")
	Set<Facture> factures;
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "fournisseurs")
	Set<SecteurActivite> secteursActivite;

}
