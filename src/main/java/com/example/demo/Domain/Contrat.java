package com.example.demo.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
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

public class Contrat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idContrat;
    LocalDate dateSignature;
    BigDecimal montantTotal;
    boolean valide;

    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL,
            orphanRemoval = true, fetch = FetchType.LAZY)
    @Builder.Default
    List<Paiement> paiements = new ArrayList<>();

    @OneToOne(fetch = FetchType.LAZY)           // côté propriétaire (voir section 4)
    Reservation reservation;

    public void addPaiement(Paiement p) { paiements.add(p); p.setContrat(this); }
    public void removePaiement(Paiement p) { paiements.remove(p); p.setContrat(null); }
}