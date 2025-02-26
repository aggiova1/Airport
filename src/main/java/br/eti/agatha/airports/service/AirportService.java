/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.agatha.airports.service;

import br.eti.agatha.airports.entities.Airport;
import br.eti.agatha.airports.repositories.AirportRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesideva
 */
@Service
public class AirportService {
    @Autowired
    private AirportRepository airportRepository;

    
    public List<Airport> findAll() {
        List<Airport> result = airportRepository.findAll();
         return result;
    }
    
    /**
     * Retoma DTO Airports filtrado por cidade
     *
     * @param city
     * @return
     */
    public List<Airport> findByCity(String city) {
        List<Airport> result = airportRepository.findByCityIgnoreCase(city);
        return result;
    }
}




    

