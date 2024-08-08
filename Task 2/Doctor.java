/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalclinicdemo;

/**
 *
 * @author rasan
 */
public class Doctor extends Person {
    private int employeeId;
    private String dateOfBirth;
    private String nationalIdNumber;
    private String contactNumber;
    private String qualifications;

    public Doctor(String name, String address, String nationalIdentityCardNumber, String contactDetails, int employeeId, String dateOfBirth, String nationalIdNumber, String contactNumber, String qualifications) {
        super(name, address, nationalIdentityCardNumber, contactDetails);
        this.employeeId = employeeId;
        this.dateOfBirth = dateOfBirth;
        this.nationalIdNumber = nationalIdNumber;
        this.contactNumber = contactNumber;
        this.qualifications = qualifications;
    }

    // Getter and Setter methods

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationalIdNumber() {
        return nationalIdNumber;
    }

    public void setNationalIdNumber(String nationalIdNumber) {
        this.nationalIdNumber = nationalIdNumber;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }
}
