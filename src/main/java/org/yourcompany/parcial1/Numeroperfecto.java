package org.yourcompany.parcial1;
import java.util.Scanner;

public class Numeroperfecto {
    
    // Método recursivo SOLO para calcular suma de divisores
    public static int sumarDivisores(int numero, int divisor) {
        // Caso base: si el divisor es igual al número, terminamos
        if (divisor == numero) {
            return 0;
        }
        
        // Si es divisor, lo sumamos y continuamos recursivamente
        if (numero % divisor == 0) {
            return divisor + sumarDivisores(numero, divisor + 1);
        } else {
            return sumarDivisores(numero, divisor + 1);
        }
    }
    
    // Método para validar si es perfecto
    public static boolean esPerfecto(int numero) {
        if (numero <= 0) {
            return false;
        }
        return sumarDivisores(numero, 1) == numero;
    }
    
    // Método para mostrar resultado
    public static void mostrarResultado(int numero, Scanner input) {
        if (esPerfecto(numero)) {
            System.out.println("El número " + numero + " es perfecto");
        } else {
            System.out.println("El número " + numero + " no es perfecto");
        }
        
        // Esperar a que el usuario presione Enter para continuar
        System.out.println("\nPresione Enter para continuar...");
        input.nextLine();
    }
    
    // Método ejecutar para ser llamado desde el menú
    public static void ejecutar(Scanner input) {
        System.out.print("Ingrese un número para verificar si es perfecto: ");
        int numero = input.nextInt();
        input.nextLine(); // consume the newline
        
        mostrarResultado(numero, input);
    }
    
    
}

