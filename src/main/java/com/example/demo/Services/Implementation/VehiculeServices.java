package com.example.demo.Services.Implementation;

import com.example.demo.Domain.Vehicule;
import com.example.demo.Repository.IVehiculeRepository;
import com.example.demo.Services.IVehiculeServices;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeServices implements IVehiculeServices {

    private final IVehiculeRepository vehiculeRepository;
    private final IVehiculeServices iVehiculeServices;

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        // Implementation for adding a vehicle
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return  vehiculeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Vehicule not found with id: " + id));
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);

    }
}
