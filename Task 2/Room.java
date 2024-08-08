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
public class Room {
    private int roomNumber;
    private List<Patient> patients;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.patients = new ArrayList<>();
    }

    // Getter and Setter methods

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    // Method to assign patient to room
    public void assignPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient " + patient.getName() + " assigned to room " + roomNumber);
    }
}
