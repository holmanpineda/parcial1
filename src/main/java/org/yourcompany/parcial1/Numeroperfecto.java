package org.yourcompany.parcial1;

public class Numeroperfecto {
    
    // Método recursivo para calcular suma de divisores
    public static int sumarDivisores(int numero, int divisor) {
        // Caso base: si el divisor es igual al número, terminamos
        if (divisor == numero) {
            return 0;
        }
        
        // Si es divisor, lo sumamos y continuamos recursivamente
        if (numero % divisor == 0) {
            return divisor + sumarDivisores(numero, divisor + 1);
        } else {
            // Si no es divisor, solo continuamos sin sumar
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
    public static void mostrarResultado(int numero) {
        if (esPerfecto(numero)) {
            System.out.println("El número " + numero + " es perfecto");
        } else {
            System.out.println("El número " + numero + " no es perfecto");
        }
    }
    
    
        
        
}

