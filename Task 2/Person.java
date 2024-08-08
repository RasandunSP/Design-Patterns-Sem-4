/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalclinicdemo;

/**
 *
 * @author rasan
 */
public class Person {
    private String name;
    private String address;
    private String nationalIdentityCardNumber;
    private String contactDetails;

    public Person(String name, String address, String nationalIdentityCardNumber, String contactDetails) {
        this.name = name;
        this.address = address;
        this.nationalIdentityCardNumber = nationalIdentityCardNumber;
        this.contactDetails = contactDetails;
    }

    // Getter and Setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationalIdentityCardNumber() {
        return nationalIdentityCardNumber;
    }

    public void setNationalIdentityCardNumber(String nationalIdentityCardNumber) {
        this.nationalIdentityCardNumber = nationalIdentityCardNumber;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    // Method to register
    public void register() {
        System.out.println("Person " + name + " registered successfully.");
    }
}
