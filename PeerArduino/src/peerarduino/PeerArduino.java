/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peerarduino;

/**
 *
 * @author broch_mattia
 */
public class PeerArduino {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        socketUDP s= new socketUDP(3333);
        DaArduone.setPort(3);
        s.send(DaArduone.getFromArduone(), 5555, "localhost");
        
    }
    
}