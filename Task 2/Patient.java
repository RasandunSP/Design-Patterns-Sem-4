/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalclinicdemo;

/**
 *
 * @author rasan
 */
public class Patient extends Person{
    public Patient(String name, String address, String nationalIdentityCardNumber, String contactDetails) {
        super(name, address, nationalIdentityCardNumber, contactDetails);
    }

    // Method to schedule appointment
    public void scheduleAppointment() {
        System.out.println("Patient " + getName() + " scheduling appointment.");
    }

    // Method to make payment
    public void makePayment() {
        System.out.println("Patient " + getName() + " making payment.");
    }
}
