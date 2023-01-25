/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprogramita;

import java.util.Scanner;

/**
 *Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
*usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
*pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
*Nota: investigar la función Lenght() en Java.
 * @author Martin
 */
public class ocho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("coloque una frase");
        String palabra = leer.nextLine();
        if (palabra.length() == 8) {
            System.out.println("correcto");
            
        }else{
            System.out.println("incorrecto");
        }
        
        // TODO code application logic here
    }
    
}
