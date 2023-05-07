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
}
