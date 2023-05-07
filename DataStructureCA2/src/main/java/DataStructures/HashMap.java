/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import AppData.Patient;
import java.util.LinkedList;

/**
 *
 * @author carol
 */
public class HashMap {

    private static final int DEFAULT_CAPACITY = 30;
    private LinkedList<Entry>[] data;
    private int size;

    /**
     * Constructs a new HashMap with the default capacity.
     */
    public HashMap() {
        data = new LinkedList[DEFAULT_CAPACITY];
    }

    /**
     * Constructs a new HashMap with the specified capacity.
     *
     * @param capacity: the initial capacity of the HashMap
     * @throws IllegalArgumentException: if the specified capacity is less than
     * or equal to zero
     */
    public HashMap(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Map capacity cannot be less than 1");
        }
        data = new LinkedList[capacity];
    }

    /**
     * Returns the number of elements stored in the HashMap.
     *
     * @return: the size of the HashMap
     */
    public int size() {
        return size;
    }

    /**
     * This method takes in a key and calculates the appropriate slot for that
     * key using the modulus operation. It returns the slot where the Patient
     * should be stored in the Map
     *
     * @param key: the key to hash
     * @return: the index of the array where the key-value pair will be stored
     */
    public int hash(String key) {
        int hash = key.hashCode();
        hash = Math.abs(hash);
        hash = hash % data.length;
        return hash;
    }

    /**
     * This method takes in a key and a Patient object and adds the new pairing
     * to the Map in the appropriate location. If the key is already present,
     * the method updates the associated value and returns the old version. If
     * the key is not already present in the Map, the method adds the key-value
     * pair to the Map in the next available slot
     *
     * @param key: the key to associate with the value
     * @param value: the value to associate with the key
     * @return: the previous value associated with the specified key, or null if
     * there was no mapping for the key
     * @throws: IllegalArgumentException if the specified key or value is null
     */
    public Patient put(String key, Patient value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("Null fields not permitted");
        }

        int slot = hash(key);

        if (data[slot] == null) {
            data[slot] = new LinkedList();
            Entry newEntry = new Entry(key, value);
            data[slot].add(newEntry);
            size++;
            return null;
        } else {
            for (Entry e : data[slot]) {
                if (e.key.equals(key)) {
                    Patient oldValue = e.updateValue(value);
                    return oldValue;
                }
            }
        }

        Entry newEntry = new Entry(key, value);
        data[slot].add(newEntry);
        size++;
        return null;

    }

    /**
     * This method takes in a key and returns the value (which is a Patient
     * object) associated with that key. If the key is not found in the Map, the
     * method returns null or an appropriate value to indicate this.
     *
     * @param key: the key whose associated value is to be returned
     * @return: the value to which the specified key is mapped, or null if this
     * map contains no mapping for the key
     */
    public Patient get(String key) {
        int slot = hash(key);

        if (data[slot] != null) {
            for (Entry entry : data[slot]) {
                if (entry.getKey() == key) {
                    return entry.getValue();
                }
            }
        }

        return null;
    }

    /**
     * Removes This method takes in a key and removes the key/value pair
     * associated with that key from the Map. It returns the value (which is a
     * Patient object) that has been removed. If the key is not found in the
     * Map, the method returns null or an appropriate value to indicate this
     *
     * @param key: the key whose mapping is to be removed from the map
     * @return: the previous value associated with the specified key, or null if
     * there was no mapping for the key
     */
    public Patient remove(String key) {
        int slot = hash(key);

        if (data[slot] != null) {
            for (Entry entry : data[slot]) {
                if (entry.key == key) {
                    Patient oldValue = entry.value;
                    data[slot].remove(entry);
                    size--;
                    return oldValue;
                }
            }
        }

        return null;
    }

    /**
     * this method takes in a key and checks whether that key is within the map
     * or not. The method returns true if the key is found and false otherwise.
     *
     * @param key the key whose presence in this map is to be tested
     * @return true if this map contains a mapping for the specified key
     */
    public boolean containsKey(String key) {
        int slot = hash(key);

        if (data[slot] != null) {
            for (Entry entry : data[slot]) {
                if (entry.getKey() == key) {
                    return true;
                }
            }
        }

        return false;
    }

    public String[] getKeys() {
        String[] keys = new String[size];
        int i = 0;
        for (LinkedList<Entry> list : data) {
            if (list != null) {
                for (Entry e : list) {
                    keys[i++] = e.key;
                }
            }
        }
        return keys;
    }

    public Patient[] getValues() {
        Patient[] values = new Patient[size];
        int i = 0;
        for (LinkedList<Entry> list : data) {
            if (list != null) {
                for (Entry e : list) {
                    values[i++] = e.getValue();
                }
            }
        }
        return values;
    }

    private static class Entry {

        private final String key;
        private Patient value;

        public Entry(String key, Patient value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Patient getValue() {
            return value;
        }

        public Patient updateValue(Patient newValue) {
            Patient oldValue = value;
            this.value = newValue;
            return oldValue;
        }
    }
}
