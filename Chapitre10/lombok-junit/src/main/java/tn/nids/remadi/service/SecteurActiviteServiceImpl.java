package tn.nids.remadi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.nids.remadi.entities.SecteurActivite;
import tn.nids.remadi.repository.SecteurActiviteRepository;

@Slf4j
@Service("secteurActiviteService")
public class SecteurActiviteServiceImpl implements SecteurActiviteService {

	@Autowired
	private SecteurActiviteRepository secteurActiviteRepository;

	@Override
	public List<SecteurActivite> retrieveAllSecteurActivites() {
		List<SecteurActivite> secteursActivite = (List<SecteurActivite>) secteurActiviteRepository.findAll();
		for (SecteurActivite secteurActivite : secteursActivite) {
			log.info("Secteur d'activité : " + secteurActivite);
		}
		return secteursActivite;
	}

	@Override
	public SecteurActivite addSecteurActivite(SecteurActivite sa) {
		return secteurActiviteRepository.save(sa);
	}

	@Override
	public SecteurActivite updateSecteurActivite(SecteurActivite sa) {
		return secteurActiviteRepository.save(sa);
	}

	@Override
	public Optional<SecteurActivite> retrieveSecteurActivite(Long id) {
		return secteurActiviteRepository.findById(id);
	}

	@Override
	public void removeSecteurActivite(Long id) {
		secteurActiviteRepository.deleteById(id);
	}
}
