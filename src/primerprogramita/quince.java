/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprogramita;

/**
 *Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 * @author Martin
 */
public class quince {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        sumavector();
        // TODO code application logic here
    }
    public static void sumavector(){
        int[] vector =new int[100];
        int suma=0;
        for (int i = 0; i < 100; i++) {
            suma+= i;
            System.out.println(suma);
           
        }
        
    }
            
    
}
