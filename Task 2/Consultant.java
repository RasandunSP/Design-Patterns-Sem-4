/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalclinicdemo;

/**
 *
 * @author rasan
 */
public class Consultant extends Doctor {
    private String postGraduateQualification;
    private String universityCountry;

    public Consultant(String name, String address, String nationalIdentityCardNumber, String contactDetails, int employeeId, String dateOfBirth, String nationalIdNumber, String contactNumber, String qualifications, String postGraduateQualification, String universityCountry) {
        super(name, address, nationalIdentityCardNumber, contactDetails, employeeId, dateOfBirth, nationalIdNumber, contactNumber, qualifications);
        this.postGraduateQualification = postGraduateQualification;
        this.universityCountry = universityCountry;
    }

    // Method to provide consultation
    public void provideConsultation() {
        System.out.println("Consultant " + getName() + " providing consultation.");
    }
}
