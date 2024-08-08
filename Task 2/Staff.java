/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalclinicdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasan
 */
public class Staff extends Person{
    private int employeeId;
    private Manager manager;
    private List<Nurse> nurses;
    private Receptionist receptionist;

    public Staff(String name, String address, String nationalIdentityCardNumber, String contactDetails, int employeeId, Manager manager, Receptionist receptionist) {
        super(name, address, nationalIdentityCardNumber, contactDetails);
        this.employeeId = employeeId;
        this.manager = manager;
        this.receptionist = receptionist;
        this.nurses = new ArrayList<>();
    }

    // Getter and Setter methods

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Nurse> getNurses() {
        return nurses;
    }

    public void setNurses(List<Nurse> nurses) {
        this.nurses = nurses;
    }

    public Receptionist getReceptionist() {
        return receptionist;
    }

    public void setReceptionist(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    // Method to manage appointments
    public void manageAppointments() {
        System.out.println("Staff " + getName() + " managing appointments.");
    }

    // Method to manage registrations
    public void manageRegistrations() {
        System.out.println("Staff " + getName() + " managing registrations.");
    }

    // Method to add nurse
    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
        System.out.println("Nurse " + nurse.getName() + " added to staff.");
    }
}
