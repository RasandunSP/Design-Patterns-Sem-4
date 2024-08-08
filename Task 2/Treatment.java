/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalclinicdemo;

/**
 *
 * @author rasan
 */
public class Treatment {
    private String typeOfTreatment;
    private float cost;

    public Treatment(String typeOfTreatment, float cost) {
        this.typeOfTreatment = typeOfTreatment;
        this.cost = cost;
    }

    // Getter and Setter methods

    public String getTypeOfTreatment() {
        return typeOfTreatment;
    }

    public void setTypeOfTreatment(String typeOfTreatment) {
        this.typeOfTreatment = typeOfTreatment;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // Method to record treatment
    public void recordTreatment() {
        System.out.println("Treatment recorded: " + typeOfTreatment);
    }
}
