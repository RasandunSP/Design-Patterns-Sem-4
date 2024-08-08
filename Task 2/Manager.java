/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalclinicdemo;

/**
 *
 * @author rasan
 */
public class Manager extends Staff{
    public Manager(String name, String address, String nationalIdentityCardNumber, String contactDetails, int employeeId, Manager manager, Receptionist receptionist) {
        super(name, address, nationalIdentityCardNumber, contactDetails, employeeId, manager, receptionist);
    }

    // Method to supervise
    public void supervise() {
        System.out.println("Manager " + getName() + " supervising staff.");
    }
}
