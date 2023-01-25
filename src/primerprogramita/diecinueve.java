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
public class diecinueve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int[][] matriz= new int[3][3];
        int[][] matriz2=new int[3][3];
        
        asignarmatriz(matriz);
        
           for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz2[i][j]=matriz[j][i];
            }
        }
        //asignarmatriz(matriz2);
        
        System.out.println(""+compararmatriz(matriz,matriz2));
        
        
        
        
    }
    
    public static void asignarmatriz(int[][] matriz){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=(int)(Math.random()*(10-1)+1);
            }
        }
    }
    
    public static boolean compararmatriz(int[][]matriz, int[][] matriz2){
        boolean resultado=false;
        int count=0;
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j]==matriz2[j][i]) {
                   count++;
                }
                ;
            }
        }
         if (count==9) {
            resultado=true;
           
         }
         return resultado;  
    }
    
}
