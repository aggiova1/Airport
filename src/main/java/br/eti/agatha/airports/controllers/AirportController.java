/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.agatha.airports.controllers;

import br.eti.agatha.airports.DTO.AirportMinDTO;
import br.eti.agatha.airports.entities.Airport;
import br.eti.agatha.airports.service.AirportService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesideva
 */
@RestController
public class AirportController {
    
    @Autowired
    private AirportService airportService;
    
    /**
     * EndPoint/ airports/airport
     * Retorna TODOS os aeroportos da base de dados.
     * @rerturn
     */
    
   @GetMapping("/airport")
    public List<Airport> findAll() {
        List<Airport> result = airportService.findAll();
        return result;
    }
    
    /**
     * Endpoint /airports/city/{city name}
     * @param cityName
     * @return
     */
    @GetMapping("/city/{cityName}")
    public ResponseEntity<List<Airport>> findByCityIgnoreCase(@PathVariable String cityName) {
        List <Airport> result = airportService.findByCity(cityName);
        
        if (result.isEmpty()) {
            // ops.. lista vazia..
            // notFound devolve 404
            return ResponseEntity.notFound().build();
            
        } else {
            // eba! tem dados!
            // ok, devolve 200
            return ResponseEntity.ok(result);
        }
    }
    
    
    @GetMapping("/country/{countryName}")
    public ResponseEntity<List<AirportMinDTO>> findByCountryIgnoreCase(@PathVariable String countryName) {
        
        List<AirportMinDTO> result = airportService.findByCountry(countryName);
        if (result.isEmpty()) {
            // ops.. lista vazia..
            // not found devolve 404
            return ResponseEntity.notFound().build();
            
        } else {
            // eba! tem dados!
            // ok devolve 200
            return ResponseEntity.ok(result);
        }
    }
    @GetMapping("/iatacode/{iataCode}")
    public ResponseEntity<Airport> findByIataCode(@PathVariable String iataCode) {
        Airport result = airportService.findByIataCode(iataCode);
        
        if (result == null) {
            
            return ResponseEntity.notFound().build();
            
        } else { 
            return ResponseEntity.ok(result);
        }
    }
    }
    

