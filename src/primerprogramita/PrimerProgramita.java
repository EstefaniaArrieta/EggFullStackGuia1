/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprogramita;

import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class PrimerProgramita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String nombre; 
        
        System.out.println("Ingrese su nombre por favor");
        nombre= leer.next();
        System.out.println("bienvenido/a " + nombre + " a mi primer programa");
    }
    
}
