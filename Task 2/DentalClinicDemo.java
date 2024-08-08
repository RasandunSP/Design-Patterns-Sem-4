/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dentalclinicdemo;

/**
 *
 * @author rasan
 */
public class DentalClinicDemo {

    public static void main(String[] args) {
        // Creating a manager
        Manager manager = new Manager("John Doe", "123 Main St", "123456789", "123-456-7890", 101, null, null);

        // Creating a receptionist
        Receptionist receptionist = new Receptionist("Alice Smith", "456 Oak St", "987654321", "987-654-3210", 102, null, null);

        // Creating a nurse
        Nurse nurse1 = new Nurse("Emily Johnson", "789 Elm St", "456789012", "456-789-0123", 103, manager, receptionist);

        // Creating a room
        Room room1 = new Room(101);

        // Assigning nurse to staff
        manager.addNurse(nurse1);

        // Creating a patient
        Patient patient1 = new Patient("Jane Doe", "321 Pine St", "789012345", "789-012-3456");

        // Creating a doctor
        OrdinaryDentist dentist1 = new OrdinaryDentist("Dr. Smith", "789 Elm St", "456789012", "456-789-0123", 201, "01-01-1970", "ID123", "123-456-7890", "DDS", 10);

        // Creating an appointment
        Appointment appointment1 = new Appointment(dentist1, patient1, room1, "2024-05-07 10:00 AM");

        // Creating a treatment
        Treatment treatment1 = new Treatment("Tooth extraction", 200.0f);

        // Creating a payment
        Payment payment1 = new Payment(200.0f, "2024-05-07");

        // Registering patient
        patient1.register();

        // Managing appointments and registrations
        receptionist.manageAppointments();
        receptionist.manageRegistrations();

        // Scheduling appointment
        appointment1.schedule();

        // Recording treatment
        treatment1.recordTreatment();

        // Processing payment
        payment1.processPayment();
    }
}
