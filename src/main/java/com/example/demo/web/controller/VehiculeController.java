package com.example.demo.web.controller;


import com.example.demo.Domain.Vehicule;
import com.example.demo.Services.IVehiculeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("vehicule")
public class VehiculeController {
    private final IVehiculeServices vehiculeServices;

    @PostMapping("add")
    public Vehicule createVehicule(@RequestBody Vehicule vehicule) {
        return vehiculeServices.addVehicule(vehicule);
    }

    @GetMapping("{id}")
    public Vehicule getVehicule(@PathVariable Long id) {
        return vehiculeServices.getVehiculeById(id);
    }

}
