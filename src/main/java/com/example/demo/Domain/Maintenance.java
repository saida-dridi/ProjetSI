package com.example.demo.Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idMaintenance;
    LocalDate dateDebut;
    LocalDate dateFin;
    String descripition;

}
