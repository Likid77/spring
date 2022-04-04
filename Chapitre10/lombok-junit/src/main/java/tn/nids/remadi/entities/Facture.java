package tn.nids.remadi.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.*;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Facture implements Serializable {

	static final long serialVersionUID = 1L;

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idFacture;
	@Column
	float montantRemise;
	@Column
	float montantFacture;
	@Temporal(TemporalType.DATE)
	Date dateCreationFacture;
	@Temporal(TemporalType.DATE)
	Date dateDerniereModification;
	@Column
	boolean archivee;

	// Associations
	@ManyToOne
	Fournisseur fournisseur;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facture")
	Set<DetailFacture> detailsFacture;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "facture")
	Set<Reglement> reglements;

}
