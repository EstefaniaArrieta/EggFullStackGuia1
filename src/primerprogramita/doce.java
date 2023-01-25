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
public class doce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        String fde="&&&&&";
        String frase;
        int correcto=0;
        int incorrecto =0;
        int cent=0;
        
        do {        
            System.out.println("a continuacion ingrese el codigo");
            
            frase=leer.next();
            
            if (frase.length() == 5) {
                
                if (frase.substring(0,1).equals("X")) {
                    if (frase.substring(4,5).equals(("O"))) {
                        correcto++;
                    }
                
                }else if (frase.equals("&&&&&")) {
                cent=1;
                }else{
                    incorrecto++;
                }
                
            }else{
                incorrecto++ ;
            }
            
           
        } while (cent <1);
        
        System.out.println("La cantidad de codigos correctos es " + correcto);
        System.out.println("La cantidad de codigos incorrectos es " + incorrecto);
         
    }
    
}
