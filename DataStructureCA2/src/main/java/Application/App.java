/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import AppData.Appointment;
import AppData.Patient;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class App {

    private static Queue<Patient> appointments = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Add a new patient");
            System.out.println("2. Delete a patient");
            System.out.println("3. Display all patients");
            System.out.println("4. Create a new Appointment for a patient");
            System.out.println("5. Call next Patient");
            System.out.println("6. Exit Application");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    deletePatient();
                    break;
                case 3:
                    displayPatients();
                    break;
                case 4:
                    newAppointment();
                    break;
                case 5:
                    nextPatient();
                    break;
                case 6:
                    exit();
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    private static void addPatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter second name:");
        String secName = scanner.nextLine();
        System.out.println("Enter date of birth:");
        System.out.println("Year:");
        int year = scanner.nextInt();
        System.out.println("Month:");
        int month = scanner.nextInt();
        System.out.println("Day:");
        int day = scanner.nextInt();
        LocalDate dob = LocalDate.of(year, month, day);
        System.out.println("Enter date you joined:");
        System.out.println("jYear:");
        int jYear = scanner.nextInt();
        System.out.println("jMonth:");
        int jMonth = scanner.nextInt();
        System.out.println("jDay:");
        int jDay = scanner.nextInt();
        LocalDate djoin = LocalDate.of(jYear, jMonth, jDay);
        Patient patient = new Patient(firstName, secName, dob, djoin);
        if (appointments.contains(patient)) {
            System.out.println("Patient already exists");
        } else {
            appointments.offer(patient);
            System.out.println("Patient added successfully");
        }
    }

    private static void deletePatient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter second name:");
        String secName = scanner.nextLine();
        System.out.println("Year:");
        int year = scanner.nextInt();
        System.out.println("Month:");
        int month = scanner.nextInt();
        System.out.println("Day:");
        int day = scanner.nextInt();
        LocalDate dob = LocalDate.of(year, month, day);
        System.out.println("Enter date you joined:");
        System.out.println("jYear:");
        int jYear = scanner.nextInt();
        System.out.println("jMonth:");
        int jMonth = scanner.nextInt();
        System.out.println("jDay:");
        int jDay = scanner.nextInt();
        LocalDate djoin = LocalDate.of(jYear, jMonth, jDay);
        Patient patient = new Patient(firstName, secName, dob, djoin);
        boolean found = false;
        Iterator<Patient> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            Patient p = iterator.next();
            if (p.equals(patient)) {
                iterator.remove();
                System.out.println("Patient deleted successfully");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Patient not found");
        }
    }

    private static void displayPatients() {
        System.out.println("All patients:");
        for (Patient patient : appointments) {
            System.out.println(patient);
        }
    }

    private static void newAppointment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter second name:");
        String secName = scanner.nextLine();

        System.out.println("Date of Birth");
        System.out.println("Year:");
        int year = scanner.nextInt();
        System.out.println("Month:");
        int month = scanner.nextInt();
        System.out.println("Day:");
        int day = scanner.nextInt();
        LocalDate dob = LocalDate.of(year, month, day);

        System.out.println("Date you joined");
        System.out.println("jYear:");
        int jYear = scanner.nextInt();
        System.out.println("jMonth:");
        int jMonth = scanner.nextInt();
        System.out.println("jDay:");
        int jDay = scanner.nextInt();

        LocalDate djoin = LocalDate.of(jYear, jMonth, jDay);
        Patient patient = new Patient(firstName, secName, dob, djoin);

        if (appointments.contains(patient)) {

            System.out.println("Enter Issue:");
            String issue = scanner.nextLine();

            System.out.println("New Date of appointment");
            System.out.println("dYear:");
            int dyear = scanner.nextInt();
            System.out.println("dMonth:");
            int dmonth = scanner.nextInt();
            System.out.println("dDay:");
            int dday = scanner.nextInt();

            LocalDate date = LocalDate.of(dyear, dmonth, dday);

            System.out.println("Enter Triage Level:");
            int tLevel = scanner.nextInt();
            System.out.println("Enter Doctor name:");
            String docName = scanner.nextLine();

            Appointment appointment = new Appointment(firstName, secName, dob, issue, date, tLevel, docName);
        }
    }

    public static String nextPatient() {
//        if (appointments.isEmpty()) {
//            return "No Patients in Queue";
//        }
//
//        Patient nextPatient = appointments.peek();
//   
    return "Not implemented yet";
    }

    public static void exit() {
        System.exit(0);
    }

}
