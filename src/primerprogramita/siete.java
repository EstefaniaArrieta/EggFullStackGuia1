/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprogramita;

import java.util.Scanner;

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
*pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
*la función equals() en Java.
 * @author Martin
 */
public class siete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("a continuacion coloque una frase");
        palabra= leer.nextLine();
        if (palabra.equals("eureka")) {
            System.out.println("la frase es correcta");
            
        }else{
            System.out.println("la palabra es incorrecta");
        }
        
        // TODO code application logic here
    }
    
}
