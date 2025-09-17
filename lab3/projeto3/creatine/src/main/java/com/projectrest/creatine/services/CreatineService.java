package com.projectrest.creatine.services;

import com.projectrest.creatine.dto.CreatineDTO;
import com.projectrest.creatine.entities.Creatine;
import com.projectrest.creatine.repository.CreatineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ListFactoryBean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreatineService {

    @Autowired
    CreatineRepository creatineRepository;

    public List<CreatineDTO> findAll(){
        List<Creatine> allCreatine = creatineRepository.findAll();
        List<CreatineDTO> dto = allCreatine.stream().map(x -> new CreatineDTO(x)).toList();
        return dto;
    }

    public void save(Creatine creatine){
        creatineRepository.save(creatine);
    }

    public List<CreatineDTO> findById(Long id){
        Optional<Creatine> creatineById = creatineRepository.findById(id);
        List<CreatineDTO> DTO = creatineById.stream().map(x -> new CreatineDTO(x)).toList();
        return DTO;
    }

    public void delete(Long id){
        creatineRepository.delete(creatineRepository.getReferenceById(id));
    }

    public CreatineDTO update(Long id, Creatine creat){
        Creatine creatine = creatineRepository.getOne(id);
        creatine.setName(creat.getName());
        creatine.setShortDescription(creat.getShortDescription());
        creatine.setLongDescription(creat.getLongDescription());
        creatine.setPrice(creat.getPrice());
        creatineRepository.save(creatine);
        CreatineDTO DTO = new CreatineDTO(creatine);
        return DTO;
    }
}
