/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

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
    
    private static class Entry{
        private final String key;
        private String value;
        
        public Entry(String key, String value){
            this.key = key;
            this.value = value;
        }
        
        public String getKey(){
            return key;
        }
        public String getValue(){
            return value;
        }
        public String updateValue(String newValue){
            String oldValue = value;
            this.value = newValue;
            return oldValue;
        }
    }
}
