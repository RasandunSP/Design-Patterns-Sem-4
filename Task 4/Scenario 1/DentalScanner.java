/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dentalscanner;

/**
 *
 * @author rasan
 */
public class DentalScanner {

    public static void main(String[] args) {
        // Get the instance of DentalScanMachine
        DentalScanMachine machine = DentalScanMachine.getInstance();
        
        // Set attributes of the dental scan machine
        machine.setSerialNumber("12345");
        machine.setManufacturer("Toshiba");
        machine.setCountryOfOrigin("Japan");
        machine.setCost(100000.0);
        
        // Retrieve and display attributes
        System.out.println("Serial Number: " + machine.getSerialNumber());
        System.out.println("Manufacturer: " + machine.getManufacturer());
        System.out.println("Country of Origin: " + machine.getCountryOfOrigin());
        System.out.println("Cost: $" + machine.getCost());
    }
}
