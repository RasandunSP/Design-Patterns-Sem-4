/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalclinicdemo;

/**
 *
 * @author rasan
 */
public class OrdinaryDentist extends Doctor{
    private int yearsOfExperience;

    public OrdinaryDentist(String name, String address, String nationalIdentityCardNumber, String contactDetails, int employeeId, String dateOfBirth, String nationalIdNumber, String contactNumber, String qualifications, int yearsOfExperience) {
        super(name, address, nationalIdentityCardNumber, contactDetails, employeeId, dateOfBirth, nationalIdNumber, contactNumber, qualifications);
        this.yearsOfExperience = yearsOfExperience;
    }
}
