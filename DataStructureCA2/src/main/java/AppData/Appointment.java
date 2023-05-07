/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppData;

import java.time.LocalDate;

/**
 * This class represents an Appointment object, which contains information about a patient's Appointment with a doctor.
 */
public class Appointment
{

    // Private fields for storing the Appointment details
    private String firstName; // The patient's first name
    private String lastName; // The patient's last name
    private LocalDate dateOfBirth; // The patient's date of birth
    private String issue; // The reason for the Appointment
    private LocalDate date; // The date of the Appointment
    private int triageLevel; // The priority level of the Appointment (e.g. urgent, non-urgent)
    private String doctorFullName; // The full name of the doctor who will be seeing the patient

// Constructor for creating an Appointment object
    public Appointment(String firstName, String lastName, LocalDate dateOfBirth, String issue, LocalDate date,
            int triageLevel, String doctorFullName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.issue = issue;
        this.date = date;
        this.triageLevel = triageLevel;
        this.doctorFullName = doctorFullName;
    }

    // Getter and Setter methods for accessing and modifying the Appointment details
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

// Equals method for comparing Appointment objects
    @Override
    public boolean equals(Object o) {
        if (this == o) { // If both objects refer to the same object in memory, they are equal
            return true;
        }
        if (!(o instanceof Appointment)) { // If the object being compared is not an Appointment object, they are not equal
            return false;
        }
        Appointment that = (Appointment) o; // Cast the object to an Appointment object and compare the fields
        return firstName.equals(that.firstName)
                && lastName.equals(that.lastName)
                && dateOfBirth.equals(that.dateOfBirth)
                && issue.equals(that.issue)
                && date.equals(that.date);
    }

    // HashCode method for creating a unique integer representation of the Appointment object
    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + dateOfBirth.hashCode();
        result = 31 * result + issue.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }

    // CompareTo method for natural ordering of Appointment objects based on triage level
    public int compareTo(Appointment other) {
        if (this.triageLevel == other.triageLevel) {
            return 0;
        } else if (this.triageLevel < other.triageLevel) {
            return -1;
        } else {
            return 1;
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Appointment{"
                + "firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + ", dateOfBirth=" + dateOfBirth
                + ", issue='" + issue + '\''
                + ", date=" + date
                + ", triageLevel=" + triageLevel
                + ", doctorFullName='" + doctorFullName + '\''
                + '}';
    }
}
