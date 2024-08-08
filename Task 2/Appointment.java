/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalclinicdemo;

/**
 *
 * @author rasan
 */
public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private Room room;
    private String appointmentTime;

    public Appointment(Doctor doctor, Patient patient, Room room, String appointmentTime) {
        this.doctor = doctor;
        this.patient = patient;
        this.room = room;
        this.appointmentTime = appointmentTime;
    }

    // Getter and Setter methods

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    // Method to schedule appointment
    public void schedule() {
        System.out.println("Appointment scheduled for patient " + patient.getName() + " with doctor " + doctor.getName() + " at " + appointmentTime);
    }
}
