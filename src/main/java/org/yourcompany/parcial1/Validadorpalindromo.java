package org.yourcompany.parcial1;
import java.util.Scanner;

public class Validadorpalindromo {

    public static void validapalindromo(Scanner input){

        System.out.println("Ingrese una palabra: ");
        String palabra1 = input.nextLine();
        String palabra2 = "";
        for (int i = palabra1.length() - 1; i >= 0; i--) {
            palabra2 += palabra1.charAt(i);
        }
        if (palabra1.equalsIgnoreCase(palabra2)){
            System.out.println("La palabra " + palabra1 + " es un palíndromo");
        } else {
            System.out.println("La palabra " + palabra1 + " no es un palíndromo");
        }
    }

}