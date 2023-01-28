package com.Alex.Forest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Alex.Forest.repository.SpeciesRepository;
import com.Alex.Forest.tables.Plant_Species;

@Service
public class SpeciesServiceImpl implements SpeciesService{
  private SpeciesRepository speciesRepository;
  
  @Autowired
  public SpeciesServiceImpl(SpeciesRepository speciesRepository) {
    super();
    this.speciesRepository = speciesRepository;
  }
  //This CREATES
  @Override
  public Plant_Species saveSpecies(Plant_Species species) {
    return speciesRepository.save(species);
  }
  //this READS
  @Override
  public List<Plant_Species> getAllSpecies() {
    return speciesRepository.findAll();
  }
}
