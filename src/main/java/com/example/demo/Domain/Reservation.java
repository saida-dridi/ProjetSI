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
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idReservation;
    LocalDate dateDebut; LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    StatutReservation statut;           // renommez StatutResevation en StatutReservation

    @ManyToOne
    Client client;

    @ManyToOne
    Vehicule vehicule;

    @OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL)
    Contrat contrat;
}
