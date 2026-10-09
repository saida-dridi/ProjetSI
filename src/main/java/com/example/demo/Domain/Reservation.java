package com.example.demo.Domain;

import jakarta.persistence.*;
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

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idReservation;
    LocalDate dateDebut;
    LocalDate dateFin;

    @Enumerated(value= EnumType.STRING)
    StatutResevation statut;


}
