package com.example.demo.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idClient;
    String name;
    String prenom;
    String adresse;
    String telephone;
    String numPermis;
    String email;
    LocalDateTime dateInscription;
}
