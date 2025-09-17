package com.projectrest.creatine.controller;

import com.projectrest.creatine.entities.Creatine;
import com.projectrest.creatine.services.CreatineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.projectrest.creatine.dto.CreatineDTO;

import java.util.List;

@RestController
@RequestMapping("/creatines")
public class CreatineController {

    @Autowired
    CreatineService creatineService;

    @GetMapping
    public List<CreatineDTO> findAll(){
        List<CreatineDTO> dto = creatineService.findAll();
        return dto;
    }

    @PostMapping
    public ResponseEntity cadastrarCreatine(@RequestBody Creatine request){
        creatineService.save(request);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public List<CreatineDTO> buscarPorId(@PathVariable Long id){
        return creatineService.findById(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarCreatine(@PathVariable Long id){
        creatineService.delete(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizarCreatine(@PathVariable Long id, @RequestBody Creatine request){
        CreatineDTO dto = creatineService.update(id,request);

        return ResponseEntity.ok(dto);
    }
}
