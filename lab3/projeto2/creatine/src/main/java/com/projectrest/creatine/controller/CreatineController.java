package com.projectrest.creatine.controller;

import com.projectrest.creatine.dto.CreatineDTO;
import com.projectrest.creatine.entities.Creatine;
import com.projectrest.creatine.services.CreatineServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/creatines")
public class CreatineController {

    @Autowired
    CreatineServices creatineServices;

    @GetMapping
    public List<CreatineDTO> findAll(){
        List<CreatineDTO> dto = creatineServices.findAll();
        return dto;
    }

    @PostMapping
    public ResponseEntity<Creatine> cadastrarCreatine(@RequestBody Creatine request){
        Creatine creatineSalvo = new Creatine();
        creatineSalvo.setName(request.getName());
        creatineSalvo.setShortDescription(request.getShortDescription());
        creatineSalvo.setLongDescription(request.getLongDescription());
        creatineSalvo.setPrice(request.getPrice());

        creatineServices.cadastrar(creatineSalvo);
        return ResponseEntity.ok().build();
    }
}
