package com.example.homepharmacy.repositories;

import com.example.homepharmacy.models.Drug;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DrugRepository extends MongoRepository<Drug, UUID> {
    List<Drug> findByName(String name);
}
