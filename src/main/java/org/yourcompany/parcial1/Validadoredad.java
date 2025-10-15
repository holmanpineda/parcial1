package org.yourcompany.parcial1;
import java.util.Scanner;

public class Validadoredad {

    public static void validamayoriaedad(Scanner input){

        System.out.println("Ingrese su edad: ");
        int edad1 = input.nextInt();
        input.nextLine(); // consume the newline
        if (edad1 >= 18){
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Usted es menor de edad");
        }


    } 
    
}