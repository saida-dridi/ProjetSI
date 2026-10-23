package com.example.demo.Repository;

import com.example.demo.Domain.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehiculeRepository  extends JpaRepository<Vehicule, Long> {
}
