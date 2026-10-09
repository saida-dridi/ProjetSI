package com.example.demo.Domain;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idPaiement;
    BigDecimal montant;
    LocalDateTime datePaiement;

    @Enumerated(value= EnumType.STRING)
    ModePaiement modePaiement;

}
