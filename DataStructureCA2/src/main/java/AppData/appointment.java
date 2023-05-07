/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppData;

import java.time.LocalDate;

/**
 * This class represents an Appointment object, which contains information about a patient's appointment with a doctor.
 */
public class appointment
{

    // Private fields for storing the appointment details
    private String firstName; // The patient's first name
    private String lastName; // The patient's last name
    private LocalDate dateOfBirth; // The patient's date of birth
    private String issue; // The reason for the appointment
    private LocalDate date; // The date of the appointment
    private int triageLevel; // The priority level of the appointment (e.g. urgent, non-urgent)
    private String doctorFullName; // The full name of the doctor who will be seeing the patient

// Constructor for creating an Appointment object
    public appointment(String firstName, String lastName, LocalDate dateOfBirth, String issue, LocalDate date,
            int triageLevel, String doctorFullName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.issue = issue;
        this.date = date;
        this.triageLevel = triageLevel;
        this.doctorFullName = doctorFullName;
    }

    // Getter and Setter methods for accessing and modifying the appointment details
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getTriageLevel() {
        return triageLevel;
    }

    public void setTriageLevel(int triageLevel) {
        this.triageLevel = triageLevel;
    }

    public String getDoctorFullName() {
        return doctorFullName;
    }

    public void setDoctorFullName(String doctorFullName) {
        this.doctorFullName = doctorFullName;
    }
}
