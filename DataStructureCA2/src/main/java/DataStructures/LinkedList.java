/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import AppData.Appointment;

/**
 *
 * @author oran
 */
public class LinkedList
{

    protected Node head; // the first node in the list
    protected Node tail; // the last node in the list
    protected int size; // the number of appointments in the list

    protected static class Node
    {

        protected Appointment data; // the appointment object stored in this node
        protected Node next; // the reference to the next node in the list

        protected Node(Appointment data) {
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
        LinkedList.Node current = head;
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
        LinkedList.Node current = head;
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
        LinkedList.Node newNode = new LinkedList.Node(appointment); // create a new node with the appointment object
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

    /**
     * Replaces the appointment at the specified index in this linked list with the specified appointment.
     *
     * @param index the index of the appointment to replace
     * @param appointment the appointment to be stored at the specified index
     * @return the appointment previously at the specified position
     * @throws IllegalArgumentException if the appointment field is null
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public Appointment set(int index, Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null"); //throws IllegalArgumentException if the appoinment field is null
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid position provided");// invalid index, output Invalid position provided
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        Appointment oldData = current.data; // save the current appointment object
        current.data = appointment; // replace it with the new appointment object
        return oldData; // return the old appointment object;
    }

    /**
     * Removes the first occurrence of the specified appointment from this linked list, if it is present.
     *
     * @param appointment the appointment to be removed from this list, if present
     * @return true if this list contained the specified appointment, false otherwise
     * @throws IllegalArgumentException if the appointment field is null
     */
    public boolean remove(Appointment appointment) {
        if (appointment == null) {
            throw new IllegalArgumentException("Appointment cannot be null"); //throws IllegalArgumentException if the appoinment field is null
        }
        if (head == null) { // list is empty
            return false;
        }
        if (head.data.equals(appointment)) {
            head = head.next;  // remove head node
            if (head == null) {  // list is now empty
                tail = null;
            }
            size--; //decrement the size
            return true;
        }
        Node current = head;
        while (current.next != null && !current.next.data.equals(appointment)) {
            current = current.next;
        }
        if (current.next != null) {
            current.next = current.next.next; // remove node after current
            if (current.next == null) {
                tail = current; // update tail reference
            }
            size--; //decrement the size
            return true;
        }
        return false; // appointment not found
    }

    /**
     *
     * Checks if the linked list is empty.
     *
     * @return true if the list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return head == null; // list is empty if head is null
    }
}
