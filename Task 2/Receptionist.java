/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalclinicdemo;

/**
 *
 * @author rasan
 */
public class Receptionist extends Staff{
    public Receptionist(String name, String address, String nationalIdentityCardNumber, String contactDetails, int employeeId, Manager manager, Receptionist receptionist) {
        super(name, address, nationalIdentityCardNumber, contactDetails, employeeId, manager, receptionist);
    }

    // Method to manage appointments
    @Override
    public void manageAppointments() {
        System.out.println("Receptionist " + getName() + " managing appointments.");
    }

    // Method to manage registrations
    @Override
    public void manageRegistrations() {
        System.out.println("Receptionist " + getName() + " managing registrations.");
    }

}
