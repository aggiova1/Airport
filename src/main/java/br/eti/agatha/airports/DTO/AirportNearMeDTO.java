/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.agatha.airports.DTO;

import br.eti.agatha.airports.projections.AirportNearMeProjection;

/**
 *
 * @author sesideva
 */
public class AirportNearMeDTO {
    
    
    
    private long Id; 
    private String name;
    private String city;
    private String iataCode;
    private double latitude;
    private double longitude;
    private double altitude;
    private double distanciaKM;

    public AirportNearMeDTO() {
    }
    
    public AirportNearMeDTO(AirportNearMeProjection airportProjection){
    this.Id = airportProjection.getId();
    this.name = airportProjection.getName();
    this.city = airportProjection.getCity();
    this.iataCode = airportProjection.getiataCode();
    this.latitude = airportProjection.getLatitude();
    this.longitude = airportProjection.getLongitude();
    this.altitude = airportProjection.getAltitude();
    this.distanciaKM = airportProjection.getDistanciaKM();
}


       
    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getIataCode() {
        return iataCode;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public double getDistanciaKM() {
        return distanciaKM;
    }
    
    
    
}
