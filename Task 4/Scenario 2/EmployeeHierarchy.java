/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeehierarchy;

/**
 *
 * @author rasan
 */
public class EmployeeHierarchy {
    public static void main(String[] args) {
        Manager james = new Manager("James", "Director");
        Manager dilshani = new Manager("Dilshani", "Dentist");
        Manager kamala = new Manager("Kamala", "Dentist");
        Manager kanchana = new Manager("Kanchana", "Nurse");
        Manager asanka = new Manager("Asanka", "Nurse");
        Manager noreen = new Manager("Noreen", "Nurse");
        IndividualEmployee suresh = new IndividualEmployee("Suresh", "Dentist", 600000);
        IndividualEmployee dilshaniDentist = new IndividualEmployee("Dilshani", "Dentist", 600000);
        IndividualEmployee kamalaDentist = new IndividualEmployee("Kamala", "Dentist", 600000);

        james.addEmployee(dilshani);
        dilshani.addEmployee(suresh);
        dilshani.addEmployee(kamala);
        kamala.addEmployee(kanchana);
        kamala.addEmployee(asanka);
        kamala.addEmployee(noreen);
        dilshani.addEmployee(dilshaniDentist);
        james.addEmployee(kamalaDentist);

        james.displayDetails("");
    }
}


