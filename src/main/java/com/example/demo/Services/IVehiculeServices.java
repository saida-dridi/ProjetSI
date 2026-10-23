package com.example.demo.Services;

import com.example.demo.Domain.Vehicule;

public interface IVehiculeServices {
    Vehicule addVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    Vehicule getVehiculeById(Long id);
    void deleteVehicule(Long id);

}
