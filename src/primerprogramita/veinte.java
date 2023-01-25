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
public class veinte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int tam=3;
        
        int[][] matriz=new int[tam][tam];
        
        System.out.println("a continuacion va a ingresar los numeros del cubo, deben ser numeros del 1 al 9 ");
        asignarvalor(matriz,tam);
        mostrarmatriz(matriz,tam);
        System.out.println("es magica?"+magic(matriz,tam));
        
    }
    
    public static void asignarvalor(int matriz[][], int tam){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.println("coloque el valor de este espacio "+ (i+1)+ ","+(j+1));
                int valor=leer.nextInt();
                if (valor<10 && valor>0) {
                    matriz[i][j]= valor;
                }else{
                    do {                        
                        System.out.println("el valor es incorrecto, ingreselo de nuevo");
                        valor=leer.nextInt();
                        
                    } while (valor>=10 || valor<=0);
                }matriz[i][j]= valor;
            }
        }
    }
    public static void mostrarmatriz(int matriz[][],int tam){
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(""+ matriz[i][j]);
            }System.out.println("");
        }
    }
    
    public static boolean magic(int[][] matriz, int tam){
        boolean resultado=false;
        int a=0;
        int b=0;
        int c=0;
        int diagonal=0;
        int nodiagonal=0;
        
        
        //valor referencia
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < tam; j++) {
                a+=matriz[i][j];
            }
        }
        //suma filas
        for (int i = 0; i < tam; i++) {
            b=0;
            for (int j = 0; j < tam; j++) {
              b+=matriz[i][j];
                if (a==b) {
                    c++;
                }
            }
        }
        
        //suma columnas
        for (int i = 0; i < tam; i++) {
            b=0;
            for (int j = 0; j < tam; j++) {
                b+=matriz[j][i];
                if (a==b) {
                    c++;
                }
            }
        }
        
        //diagonal principal
        
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (i==j) {
                    diagonal+=matriz[i][j];
                    
                } 
            }
        }
        if (diagonal==a) {
            c++;
        }
        
        //nodiagonal
        
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if ((tam-1)-j==i) {
                    nodiagonal+=matriz[i][j];
                }
            }
        }
        if (nodiagonal==a) {
            c++;
        }
       
        
        if (c==2*tam+2) {
            resultado=true;
        }
        return resultado;
    }
    
}
