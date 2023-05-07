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

}
