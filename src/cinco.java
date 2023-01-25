
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Martin
 */
public class cinco {

    /**Escribir un programa que lea un número entero por teclado y muestre por pantalla el
    *doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero");
        num=leer.nextInt();
        System.out.println("el doble de ese numero es " + (num*2));
        System.out.println("el triple de ese numero es " + (num*3));
        System.out.println("la raiz cuadrada de ese numero es " + Math.sqrt(num));
        // TODO code application logic here
    }
    
}
