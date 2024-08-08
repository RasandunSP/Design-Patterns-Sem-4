/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dentalclinicdemo;

/**
 *
 * @author rasan
 */
public class Payment {
    private float amount;
    private String paymentDate;

    public Payment(float amount, String paymentDate) {
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    // Getter and Setter methods

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    // Method to process payment
    public void processPayment() {
        System.out.println("Payment processed: Amount - " + amount + ", Date - " + paymentDate);
    }
}
