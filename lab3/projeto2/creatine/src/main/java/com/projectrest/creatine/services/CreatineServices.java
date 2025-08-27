package com.projectrest.creatine.services;

import com.projectrest.creatine.entities.Creatine;
import com.projectrest.creatine.repository.CreatineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.projectrest.creatine.dto.CreatineDTO;

@Service
public class CreatineServices {

    @Autowired
    CreatineRepository creatineRepository;

    public List<CreatineDTO> findAll(){
        List<Creatine> result = creatineRepository.findAll();
        List<CreatineDTO> dto = result.stream().map(x -> new CreatineDTO(x)).toList();
        return dto;
    }

    public void cadastrar(Creatine creatine){
        creatineRepository.save(creatine);

    }

    public Optional<Creatine> buscar(Long id){
        Optional<Creatine> creatineOptional = creatineRepository.findById(id);
        return creatineOptional;
    }

    public void deletar(Long id){
        creatineRepository.delete(creatineRepository.getReferenceById(id));
    }

}
