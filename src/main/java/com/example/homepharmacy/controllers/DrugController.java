package com.example.homepharmacy.controllers;

import com.example.homepharmacy.models.Drug;
import com.example.homepharmacy.repositories.DrugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class DrugController {

    @Autowired
    private DrugRepository drugRepository;

    @PostMapping("/drugs")
    public Drug create(@RequestBody Drug drug){
        drug.setId(UUID.randomUUID());
        return drugRepository.save(drug);
    }

    @GetMapping("/drugs/name/{name}")
    public List findByName(@PathVariable String name) {
        return drugRepository.findByName(name);
    }

    @GetMapping("/drugs")
    public List<Drug> getAll(){
        return drugRepository.findAll();
    }
    @GetMapping("/drugs/{id}")
    public Drug getById(@PathVariable UUID id){
        return drugRepository.findById(id).orElse(null);
    }
    @DeleteMapping("/drugs/{id}")
    public void deleteById(@PathVariable UUID id){
        drugRepository.deleteById(id);
    }




}
