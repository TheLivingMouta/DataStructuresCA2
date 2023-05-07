/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author carol
 */
public class MapFullException extends RuntimeException{
    public MapFullException(String message){
        super(message);
    }
    
    public MapFullException(){
        super();
    }
}
