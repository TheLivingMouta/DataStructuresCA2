/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import AppData.Patient;

/**
 *
 * @author carol
 */
public class HashMap {
    private static final int DEFAULT_CAPACITY = 103;
    private Entry [] data;
    private int size;
    
    public HashMap(){
        data = new Entry[DEFAULT_CAPACITY];
    }
    
    public HashMap(int capacity){
        if(capacity <= 0){
            throw new IllegalArgumentException("Map capacity can't be less than 1");
        }
        data = new Entry[capacity];
    }
    
    public int size(){
        return size;
    }
    
    private int hash(String key){
        int hash = key.hashCode();
        hash = Math.abs(hash);
        hash = hash % data.length;
        return hash;
    }
    
    public Patient put(String key, Patient value){
        if(key == null || value == null){
            throw new IllegalArgumentException("Null fields not permitted");
        }
        if(size == data.length){
            data = growMap();
        }
        
        int slot = hash(key);
        System.out.println("Size of map: " + size + ", capacity: " + data.length);
        System.out.println("Slot calculated: " + slot);
        
        if(data[slot] == null){
            Entry newEntry = new Entry(key, value);
            data[slot] = newEntry;
            size++;
            return null;
        }else{
            if(data[slot].key.equals(key)){
                Patient oldValue = data[slot].updateValue(value);
                return oldValue;
            }else{
                throw new SlotOccupiedException("Provided key maps to occupied slot in map.");
            }
        }
    }
    
    private Entry[] growMap(){
        Entry[] newMap = new Entry[data.length*2];
        for(int i = 0; i < data.length; i++){
            String key = data[i].key;
            int slot = key.hashCode();
            slot = Math.abs(slot);
            slot = slot % newMap.length;
            if(newMap[slot] != null){
                throw new MapFullException("Cannot complete resize operation. Continued action would result in data loss.");
            }
            newMap[slot]=data[i];
        }
        
        return newMap;
    }
    
    private static class Entry{
        private final String key;
        private Patient value;
        
        public Entry(String key, Patient value){
            this.key = key;
            this.value = value;
        }
        
        public String getKey(){
            return key;
        }
        public Patient getValue(){
            return value;
        }
        public Patient updateValue(Patient newValue){
            Patient oldValue = value;
            this.value = newValue;
            return oldValue;
        }
    }
}
