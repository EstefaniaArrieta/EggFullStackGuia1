package primerprogramita;

import java.util.Scanner;

public class prueba {

    
    public static void main(String[] args) {
        /* Ejercicio 11.  Realizar un programa que pida dos números enteros positivos por teclado y muestre por
            pantalla el siguiente menú: 
                            MENU
                            1. Sumar
                            2. Restar
                            3. Multiplicar
                            4. Dividir
                            5. Salir
                            Elija opción:
            El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
            y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
            Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
            directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
            desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
            programa, caso contrario se vuelve a mostrar el menú.*/
        
        // incializamos scanner
        Scanner scan= new Scanner(System.in);
        //variables
        int num1;
        int num2;
        int opcion;
        
        String salida="N";
        
        System.out.println("Hola, bienvenido a tu calculadora, recuerda escoger una opcion para operar...");
        System.out.println("Ingresa el primer número");
        num1=scan.nextInt();
        System.out.println("Ingresa el segundo número");
        num2=scan.nextInt();
        
        
        
         do{            
            System.out.println("Que operación deseas realizar? ");
            System.out.println(" MENU: ");
            System.out.println(" 1. Sumar ");
            System.out.println(" 2. Restar ");
            System.out.println(" 3. Multiplicar ");
            System.out.println(" 4. Dividir ");
            System.out.println(" 5. Salir");
            System.out.println(" Elija opción: ");
            opcion=scan.nextInt();
            //coloque el menu adentro del bucle
             
            switch (opcion)
        {
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)? ");
                salida= scan.next();//agregué un scan para leer la opcion
                break;//coloque un break porque sino se ejecutaba tambien defoult

            default:
                System.out.println("Escoge una opcion para poder operar");
        }
        } while (salida.equalsIgnoreCase("N")); // cambie la condicion del bucle 
         //para que dejara de ejecutarse cuando la variable salida diferente a N
    }   //el ignorecase es para que ignore si es mayuscula o minuscula. o sea para que funcione con las dos
    
}