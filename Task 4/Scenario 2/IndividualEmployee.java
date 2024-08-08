/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeehierarchy;

/**
 *
 * @author rasan
 */
public class IndividualEmployee implements Employee{
    private String name;
    private String position;
    private int salary;

    public IndividualEmployee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void displayDetails(String prefix) {
        System.out.println(prefix + "Name: " + name + ", Position: " + position + ", Salary: " + salary);
    }

    public String getPosition() {
        return position;
    }
}
