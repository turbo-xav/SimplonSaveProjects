package co.simplon.mydiet.service.implement;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;

import co.simplon.mydiet.model.entity.Aliment;
import co.simplon.mydiet.model.repository.AlimentRepository;
import co.simplon.mydiet.service.AlimentService;

@Named
public class AlimentServiceImpl implements AlimentService {

    @Inject
    AlimentRepository alimentRepository;
	
    public Aliment saveAliment(Aliment Aliment) {
	  alimentRepository.save(Aliment);
	  return Aliment;
    }

    public List<Aliment> getAll() {
	  return alimentRepository.findAll();
    }
    public Optional<Aliment> findbyId(Long id) {
		return alimentRepository.findById(id);
    }
    
	public Long deleteAlimentById(Long id) {
		return alimentRepository.deleteAlimentById(id);
	}

}
