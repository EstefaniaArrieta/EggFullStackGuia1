/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprogramita;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author Martin
 */
public class cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int grado, far;
        System.out.println("ingrese los grado centigrado");
        grado=leer.nextInt();
        far=(32+(9*grado/5));
        System.out.println("ese valor de grado en centigrado lo pasamos a Fahrenheit y el valor es " + far);
        // TODO code application logic here
    }
    
}
