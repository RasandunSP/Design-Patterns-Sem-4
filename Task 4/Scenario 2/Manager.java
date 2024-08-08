/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.employeehierarchy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasan
 */
public class Manager implements Employee{
    private String name;
    private List<Employee> subordinates = new ArrayList<>();
    private String position;

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void addEmployee(Employee employee) {
        subordinates.add(employee);
    }

    @Override
    public void displayDetails(String prefix) {
        System.out.println(prefix + "Manager: " + name + ", Position: " + position);
        for (Employee employee : subordinates) {
            employee.displayDetails(prefix + "\t");
        }
    }
}
