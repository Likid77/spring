package tn.nids.remadi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.nids.remadi.entities.CategorieFournisseur;
import tn.nids.remadi.entities.Fournisseur;

@Repository
public interface FournisseurRepository extends CrudRepository<Fournisseur, Long> {

//	SELECT
	@Query("select f from Fournisseur f where f.categorieFournisseur= :categorieFournisseur")
	public List<Fournisseur> retrieveFournisseurByCategorieFournisseur(
			@Param("categorieFournisseur") CategorieFournisseur categorieFournisseur);

	@Query(value = "select * from TFournisseur f where f.categorieFournisseur= :categorieFournisseur", nativeQuery = true)
	List<Fournisseur> retrieveFournisseursByCategorieFournisseur(
			@Param("categorieFournisseur") CategorieFournisseur categorieFournisseur);

//	UPDATE
	@Modifying
	@Query("update Fournisseur f set f.categorieFournisseur= :categorie where f.idFournisseur= :idFournisseur")
	int updateFournisseurByCategorieFournisseur(@Param("categorie") CategorieFournisseur categorieFournisseur,
			@Param("idFournisseur") Long idFournisseur);

//	DELETE
	@Modifying
	@Query("delete from Fournisseur f where f.categorieFournisseur= :categorie")
	int deleteFournisseurByCategorieFournisseur(@Param("categorie") CategorieFournisseur categorieFournisseur);

//	INSERT
	@Modifying
	@Query(value = "insert into Fournisseur(codeFournissseur, libelleFournisseur, categorieFournisseur) values (:codeFournisseur, :libelleFournisseur, :categorieFournisseur)", nativeQuery = true)
	void insertFournisseur(@Param("codeFournisseur") String codeFournisseur,
			@Param("libelleFournisseur") String libelleFournisseur,
			@Param("categorieFournisseur") CategorieFournisseur categorieFournisseur);
}
