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
public class once {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int option;
        int centinela=0;
        String option2;
        System.out.println("Bienvenido, a continuacion coloque dos numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        do {            
            System.out.println("MENU\n"+"1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción: ");
            option=leer.nextInt();
            switch (option) {
                case 1:
                    System.out.println("la suma de " + num1 + "+ " + num2 +" es igual a "+ (num1+num2) );
                    break;
                    
                case 2:
                    System.out.println("la resta de " + num1 + "- " + num2 + " es igual a " + (num1 - num2));
                    break;
                    
                case 3:
                    System.out.println("la multiplicacion de " + num1 + "* " + num2 + " es igual a " + (num1 * num2));
                    break;
                    
                case 4:
                    System.out.println("la division de " + num1 + "/ " + num2 + " es igual a " + (num1/num2));
                    break;
                
                case 5:
                    
                    System.out.println("Seguro desea salir? coloque S para salir o N para repetir menu");
                    
                    option2=leer.next();
                    
                    if (option2.equals("S")) {
                        System.out.println("Vuelva pronto");
                        centinela=1;
                        break;
                    }
                    break;
                    
                default:
                    System.out.println("Coloque una opcion correcta");
            }
        } while (centinela<1);
        
        // TODO code application logic here
    }
    
}
