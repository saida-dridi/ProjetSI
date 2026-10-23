package com.example.demo.Services.Implementation;

import com.example.demo.Domain.Vehicule;
import com.example.demo.Repository.IVehiculeRepository;
import com.example.demo.Services.IVehiculeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehiculeServices implements IVehiculeServices {

    private final IVehiculeRepository vehiculeRepository;   // le repository, PAS IVehiculeServices

    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }
}