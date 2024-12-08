package com.klef.jfsd.exam.demo.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String role; // ADMIN, USER

    @OneToOne(cascade = CascadeType.ALL)
    private NutrientProfile nutrientProfile;
}
