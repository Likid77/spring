package tn.nids.remadi.service;

import tn.nids.remadi.entities.SecteurActivite;
import java.util.List;
import java.util.Optional;

public interface SecteurActiviteService {

	public List<SecteurActivite> retrieveAllSecteurActivites();

	public SecteurActivite addSecteurActivite(SecteurActivite sa);

	public SecteurActivite updateSecteurActivite(SecteurActivite sa);

	public Optional<SecteurActivite> retrieveSecteurActivite(Long id);

	public void removeSecteurActivite(Long id);

}
