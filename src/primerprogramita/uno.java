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
public class uno {

    /**Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
    *dos. El programa deberá después mostrar el resultado de la suma
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,num2;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("a continuacion escriba dos numeros");
        num=leer.nextInt();
        num2=leer.nextInt();
        System.out.println("La suma de " + num + " + " + num2 + " es " + (num+num2) );
    }
    
}
