/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppData;

import DataStructures.LinkedList;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author carol
 */

//Private variables for storing patient information
public class Patient {
    private String firstName;
    private String secName;
    private LocalDate DoB;
    private LocalDate dateJoined;
    private LinkedList appointments;

    //default patient constructor
    public Patient() {
    }
    
    //Paramateriazed? patient constructor 
    public Patient(String firstName, String secName, LocalDate DoB, LocalDate dateJoined) {
        this.firstName = firstName;
        this.secName = secName;
        this.DoB = DoB;
        this.dateJoined = dateJoined;
    }
    
    
    //getter and setter methods for the patient information
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public LocalDate getDoB() {
        return DoB;
    }

    public void setDoB(LocalDate DoB) {
        this.DoB = DoB;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public LinkedList getAppointments() {
        return appointments;
    }

    public void setAppointments(LinkedList appointments) {
        this.appointments = appointments;
    }
    
    //Hashcode method for hashing all the patient variables
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.firstName);
        hash = 29 * hash + Objects.hashCode(this.secName);
        hash = 29 * hash + Objects.hashCode(this.DoB);
        hash = 29 * hash + Objects.hashCode(this.dateJoined);
        return hash;
    }

    //equals method to check between patients 

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.secName, other.secName)) {
            return false;
        }
        return Objects.equals(this.DoB, other.DoB);
    }
    
    
    
}
