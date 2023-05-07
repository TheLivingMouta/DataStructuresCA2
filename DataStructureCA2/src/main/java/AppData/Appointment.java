/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppData;

import java.time.LocalDate;

/**
 * This class represents an Appointment object, which contains information about a patient's appointment with a doctor.
 */
public class Appointment
{

    // Private fields for storing the appointment details
    private String firstName; // The patient's first name
    private String lastName; // The patient's last name
    private LocalDate dateOfBirth; // The patient's date of birth
    private String issue; // The reason for the appointment
    private LocalDate date; // The date of the appointment
    private int triageLevel; // The priority level of the appointment (e.g. urgent, non-urgent)
    private String doctorFullName; // The full name of the doctor who will be seeing the patient

}
