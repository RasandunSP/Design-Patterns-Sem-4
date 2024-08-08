/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalscanner;

/**
 *
 * @author rasan
 */
public class DentalScanMachine {
    private static DentalScanMachine instance;
    
    // Attributes
    private String serialNumber;
    private String manufacturer;
    private String countryOfOrigin;
    private double cost;
    
    // Private constructor to prevent instantiation
    private DentalScanMachine() {}
    
    // Method to get the instance of the DentalScanMachine
    public static DentalScanMachine getInstance() {
        if (instance == null) {
            instance = new DentalScanMachine();
        }
        return instance;
    }
    
    // Setters and getters for attributes
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}

