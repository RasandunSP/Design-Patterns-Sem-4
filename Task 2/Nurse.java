/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalclinicdemo;

/**
 *
 * @author rasan
 */
public class Nurse extends Staff{
    public Nurse(String name, String address, String nationalIdentityCardNumber, String contactDetails, int employeeId, Manager manager, Receptionist receptionist) {
        super(name, address, nationalIdentityCardNumber, contactDetails, employeeId, manager, receptionist);
    }

    // Method to assist
    public void assist() {
        System.out.println("Nurse " + getName() + " assisting.");
    }
}
