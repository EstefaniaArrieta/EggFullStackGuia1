/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprogramita;

import java.util.Scanner;

/**
 *Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
*es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
*diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
*la función Substring y equals() de Java.
 * @author Martin
 */
public class nueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("a continuacion coloque una frase");
        String frase= leer.nextLine();
        String letra= frase.substring(0,1);
        System.out.println(letra);
        if (letra.equals("A")) {
            System.out.println("correcto");
        }else if (letra.equals("a")) {
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
        
        // TODO code application logic here
    }
    
}
