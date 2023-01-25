/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprogramita;

import java.util.Scanner;

/**
 *Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 * @author Martin
 */
public class veintiuno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int[][]matriz=new int[10][10];
        int [][] matriz2=new int[3][3];
        int tam=10;
        int tam2=3;
        asignarvalor(matriz,tam);
        //asignarvalor(matriz2,tam2);
        for (int i = 0; i < tam2; i++) {
            for (int j = 0; j < tam2; j++) {
                matriz2[i][j]=matriz[i+3][j+3];
            }
        }
        
        mostrarmatriz(matriz,tam);
        mostrarmatriz(matriz2,tam2);
        
        System.out.println(""+result(matriz,matriz2,tam,tam2));
        
    }
    public static void asignarvalor(int[][]matriz,int tam){
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                matriz[i][j]=(int)(Math.random()*((10-1)+1));
            }
        }
    }
    
    public static void mostrarmatriz(int[][]matriz,int tam){
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(""+matriz[i][j]);
            }System.out.println("");
        }
        
    }
    
    public static boolean result(int [][]matriz, int[][]matriz2,int tam1,int tam2){
        boolean resultado=false;
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (matriz[i][j]==matriz2[0][0] && matriz[i][j+1]==matriz2[0][1] && matriz[i][j+2]==matriz2[0][2]) {
                    System.out.println("primer linea ok");
                    if (matriz[i+1][j]==matriz2[1][0] && matriz[i+1][j+1]==matriz2[1][1] && matriz[i+1][j+2]==matriz2[1][2]) {
                        System.out.println("segunda ok");
                        if (matriz[i+2][j]==matriz2[2][0] && matriz[i+2][j+1]== matriz2[2][1] && matriz[i+2][j+2]==matriz2[2][2]) {
                            resultado=true;
                            System.out.println("las posiciones de matriz m en las que se encuentran los mismos valores de matriz p son;");
                            System.out.println(i+","+j+" "+i+","+(j+1)+" "+i+","+(j+2));
                            System.out.println((i+1)+","+j+" "+(i+1)+","+(j+1)+" "+(i+1)+","+(j+2));
                            System.out.println((i+2)+","+j+" "+(i+2)+","+(j+1)+" "+(i+2)+","+(j+2));
                        
                        }
                    }
                }
            }
     
        }
        if (resultado==false) {
           
             System.out.println("no se encontro matriz p dentro de matriz m");
        }   
        return resultado; 
    }  
}

