/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.eti.agatha.airports.projections;

/**
 *
 * @author sesideva
 */
public interface AirportNearMeProjection {
    
    long getId();
    String getName();
    String getCity();
    String getiataCode();
    double getLatitude();
    double getLongitude();
    double getAltitude();
    double getDistanciaKM();
    
    
    
}
