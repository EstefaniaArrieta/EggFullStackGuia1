/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprogramita;

import static java.lang.Math.random;
import java.util.Scanner;

/**
 *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * @author Martin
 */
public class diezseis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("a continuacion coloque el tamaño del vector");
        int tamaño=leer.nextInt();
        
        int[] vector=new int[tamaño];
        valorrandom(tamaño, vector);
        
        System.out.println("a continuacion coloque el numero que quiere buscar en el vector");
        int num=leer.nextInt();
        
        for (int i = 0; i < tamaño-1; i++) {
            if (vector[i]==num) {
                System.out.println("su numero esta en la posicion " + i );
                }
            }
        }
     public static void valorrandom(int tamaño, int vector[]){
        for (int i = 0; i < tamaño-1; i++) {
            vector[i]= (int) (Math.random()*10);
            }
    }
        // TODO code application logic here
    }
    
   

