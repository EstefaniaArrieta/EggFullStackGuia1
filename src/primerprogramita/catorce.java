/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerprogramita;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a converir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void).
 *
 * @author Martin
 */
public class catorce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("a continuacion coloque cuantos euros tiene");
        int euro = leer.nextInt();

        System.out.println("a que moneda desea convertir: yenes, dolares o libras");
        String cambio = leer.next();
        
        
        cambiomoneda(euro,cambio);
        // TODO code application logic here
    }

    public static void cambiomoneda(int euro, String cambio) {

        if (cambio.equals("yenes")) {
            System.out.println("la cantidad de euros " + euro + " convertida a yenes serian: " + (euro * 129.852));
        } else if (cambio.equals("dolares")) {
            System.out.println("la cantidad de euros " + euro + " convertida a dolares serian: " + (euro * 1.28611));

        } else if (cambio.equals("libras")) {
            System.out.println("la cantidad de euros " + euro + " convertida a libras serian: " + (euro * 0.86));

        }else{
            System.out.println("coloque una opcion correcta");
        }
    }
}

    
