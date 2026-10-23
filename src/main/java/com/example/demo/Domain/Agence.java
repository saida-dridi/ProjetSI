package com.example.demo.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Agence {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAgence;
    String nom; String ville; String adresse; String telephone;

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    @Builder.Default
    List<Vehicule> vehicules = new ArrayList<>();

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    @Builder.Default
    List<Employe> employes = new ArrayList<>();
}