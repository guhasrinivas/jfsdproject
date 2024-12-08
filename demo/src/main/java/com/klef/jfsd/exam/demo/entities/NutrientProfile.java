package com.klef.jfsd.exam.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class NutrientProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double calories;
    private double protein;
    private double carbs;
    private double fats;
}
