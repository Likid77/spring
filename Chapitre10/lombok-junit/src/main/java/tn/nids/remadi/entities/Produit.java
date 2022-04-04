package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Produit implements Serializable {

	static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idProduit;
	@Column
	String codeProduit;
	@Column
	String libelleProduit;
	@Column
	float prix;
	@Temporal(TemporalType.DATE)
	Date dateCreation;
	@Temporal(TemporalType.DATE)
	Date dateDerniereModification;

	// Associations
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "produit")
	Set<DetailFacture> detailFactures;
	@ManyToOne
	CategorieProduit categorieProduit;
	@ManyToOne
	Stock stock;

}
