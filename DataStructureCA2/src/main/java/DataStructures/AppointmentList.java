/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import AppData.appointment;

/**
 *
 * @author oran
 */
public class AppointmentList
{

    private Node head; // the first node in the list
    private Node tail; // the last node in the list
    private int size; // the number of appointments in the list

    private static class Node
    {

        appointment data; // the appointment object stored in this node
        Node next; // the reference to the next node in the list

        private Node(appointment data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Returns the number of appointments in the list.
     *
     * @return the number of appointments in the list
     */
    public int size() {
        return size;
    }

    /**
     * Returns the appointment at the specified index in the list.
     *
     * @param index the index of the appointment to return
     * @return the appointment at the specified index, or null if the index is invalid
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public Appointment get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid position provided");// invalid index, output Invalid position provided
        }
        AppointmentList.Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data; // return the appointment at the specified index
    }

    /**
     * Returns the index of the specified appointment in the list.
     *
     * @param appointment the appointment to search for
     * @return the index of the appointment in the list, or -1 if the appointment is not found
     * @throws IllegalArgumentException if the appointment parameter is null
     *
     */
    public int indexOf(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null"); //throws IllegalArgumentException if the appoinment field is null
        }
        AppointmentList.Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(appointment)) {
                return index; // appointment found, return its index
            }
            current = current.next;
            index++;
        }
        return -1; // appointment not found, return -1
    }

    /**
     *
     * Adds the given appointment to the end of the list.
     *
     * @param appointment the appointment to add to the list
     * @return true if the appointment was successfully added to the list
     * @throws IllegalArgumentException if the appointment parameter is null
     */
    public boolean add(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null"); //throws IllegalArgumentException if the appoinment field is null
        }
        AppointmentList.Node newNode = new AppointmentList.Node(appointment); // create a new node with the appointment object
        if (tail == null) { //list is empty
            head = newNode; //make this node the first node
            tail = newNode; //make this node the last node
        } else { //list is not empty
            tail.next = newNode;    // add the new node to the tail
            tail = newNode;  // update the tail reference

        }
        size++; // increment the size of the list
        return true;
    }

}
