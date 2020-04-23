package com.example.homepharmacy.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.UUID;

@Document(value = "drugs")
@Data
@AllArgsConstructor
public class Drug {
    @Id
    private UUID id;

    private String name;
    private String type;
    private String description;
    private String dosage;
    private int quantity;
    private String shelfLife;



}
