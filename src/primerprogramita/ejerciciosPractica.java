/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprogramita;

import java.util.Scanner;

/**
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
*en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * @author Martin
 */
public class ejerciciosPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Coloque una frase");
        frase=leer.nextLine();
        System.out.println( frase.toUpperCase());
        System.out.println( frase.toLowerCase());
        // TODO code application logic here
    }
    
}
