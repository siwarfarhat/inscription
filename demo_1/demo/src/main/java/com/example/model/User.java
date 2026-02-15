package com.exemple.prototype.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users") // Nom de la table dans PostgreSQL
@Data // Génère automatiquement les Getters/Setters grâce à Lombok
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;
}