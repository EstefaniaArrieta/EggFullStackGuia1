/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprogramita;

import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author Martin
 */
public class diezsiete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [] vector;
        System.out.println("Coloque el tamaño del vector");
        int tamaño= leer.nextInt();
        int uno=0;
        int dos=0;
        int tres=0;
        int cuatro=0;
        int cinco=0;
        
        vector=new int[tamaño];
        
        asignarnumero(tamaño, vector);
        
        for (int i = 0; i < tamaño; i++) {
            if (vector[i]<10) {
                uno++;
            }else if (vector[i]<100 && vector[i]>=10) {
                dos++;
            }else if (vector[i]<1000 && vector[i]>=100) {
                tres++;
            }else if (vector[i]<10000 && vector[i]>=1000) {
                cuatro++;
            }else if (vector[i]<100000 && vector[i]>=10000) {
                cinco++;
            }
        }
        System.out.println("en total hay " + uno + " numeros de una cifra");
        System.out.println("en total hay " + dos + " numeros de dos cifras");
        System.out.println("en total hay " + tres + " numeros de tres cifras");
        System.out.println("en total hay " + cuatro + " numeros de cuatro cifras");
        System.out.println("en total hay " + cinco + " numeros de cinco cifras");
        
        
               
    }
    
    public static void asignarnumero(int tamaño,int vector[]) {
        for (int i = 0; i < tamaño; i++) {
            vector[i]= (int)(Math.random()*((10000-1)+1))+1;
            
        }
    }
    
    
    
}
