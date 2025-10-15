package org.yourcompany.parcial1;
import java.util.Scanner;

public class Menu {

    public static void mostrarMenu() {
        Scanner input = new Scanner(System.in);

int choice = 0;
while (choice != 10) {
    System.out.println("1. zodiaco por mes y año de nacimiento");
    System.out.println("2. validador por mayoria de edad");
    System.out.println("3. validador numero perfecto");
    System.out.println("4. validador de palindromo");
    System.out.println("5. validador de capicua");
    System.out.println("6. conversor de morse a texto");
    System.out.println("7. conversor de texto a morse");
    System.out.println("8. gestor de caballeros del zodiaco");
    System.out.println("9. juego libre");
    System.out.println("10. salir");

    System.out.print("Pick a number: ");

    if (input.hasNextInt()) {
        choice = input.nextInt();
    } else {
        System.out.println("That wasn't a number.");
        input.next(); // skip bad input
        continue;
    }

    System.out.println("Usted selecciono: " + choice);

    switch (choice) {
        case 1:
            // Zodiaco.zodiaco();
            break;
        case 2:
            Validadoredad.validamayoriaedad();
            break;
        case 3:
            //Numeroperfecto.sumarDivisores();
            break;
        case 4:
            Validadorpalindromo.validapalindromo();
            break;
        case 5:
            // Capicua.validarcapicua();
            break;
        case 6:
            // MorseATexto.convertirMorseATexto();
            break;
        case 7:
            // TextoAMorse.convertirTextoAMorse();
            break;
        case 8:
            Caballero.Caballero;
            break;
        case 9:
            // JuegoLibre.juegoLibre();
            break;
        case 10:
            System.out.println("Saliendo del programa...");
            break;
        default:
            System.out.println("Opcion no valida. Por favor intente de nuevo.");
    }


}
}
    }

