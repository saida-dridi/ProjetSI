package com.example.demo.web.controller;


import com.example.demo.Repository.IVehiculeRepository;
import com.example.demo.Services.IVehiculeServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("vehicule")
public class VehiculeController {
    private final IVehiculeServices vehiculeServices;
}
