/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import AppData.Appointment;
import java.util.NoSuchElementException;

/**
 *
 * @author carol
 */
public class PriorityQueue extends LinkedList
{

    @Override
    public boolean add(Appointment appointment) {
        if (head == null) {
            throw new NoSuchElementException();
        }

        Node newNode = new Node(appointment);
        Node current = head.next;
        Node previous = head;
        for (int i = 0; i < size(); i++) {
            if (tail.data.equals(newNode.data)) {
                newNode.next = tail;
                tail = newNode;
            } else if (head.data.equals(newNode.data)) {
                newNode.next = head;
                head = newNode;
            } else {
                while (current.data.equals(newNode.data)) {
                    previous = current;
                    current = current.next;
                }

                previous.next = newNode;
                newNode.next = current;

            }
        }

        size++;
        return false;

    }

}
