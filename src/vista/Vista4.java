package vista;

import java.util.Scanner;
import modelo.Clase4;

public class Vista4 {
    public static void main(String[] args) {
        // Crear objeto de la clase scanner
        Scanner miScanner = new Scanner(System.in);
        // Crear objeto de clase4
        Clase4 miobClase4 = new Clase4();
        // Boolean que define si continua el ciclo while
        var salir = false;
        while (!salir) { 
            // Variable para guardar 
            var opcion = 0;
            // Mostrar menú
            System.out.print("""
                    \n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
                    ¿Qué quieres hacer?
                    1) Calcular área de un triángulo.
                    2) Calcular área de un círculo.
                    3) Salir
                    Escoger una opcion:\s""");
            try {
                // Si el usuario ingresa un valor válido del menú (1-3)
                opcion = Integer.parseInt(miScanner.nextLine());
            } catch (Exception e) {
                // Si el usuario ingresa un valor inválido del menú
                // el bloque if else mostrará mensaje
                System.out.print("");
            }
            // Bloque if else para evaluar la opción escogida por el usuario
            if (opcion == 1) {
                try {
                    // Si el usuario ingresar un valor válido de base y altura
                    System.out.print("\nIngresar base del triángulo: ");
                    var base = Double.parseDouble(miScanner.nextLine());
                    System.out.print("Ingresar altura del triángulo: ");
                    var altura = Double.parseDouble(miScanner.nextLine());
                    // Llamar el método
                    System.out.print("\nÁrea del triángulo: " + miobClase4.calcularAreaTriangulo(base, altura));
                    
                } catch (Exception e) {
                    // Si el usuario ingresar un valor inválido de base y altura
                    System.out.print("Valor inválido para la base o la altura: " + e.getMessage());
                }
            } else if (opcion == 2) {
                try {
                    // Si el usuario ingresa un valor válido de radio
                    System.out.print("\nIngresar radio del círulo: ");
                    var radio = Double.parseDouble(miScanner.nextLine());
                    // Llamar el método
                    System.out.print("\nÁrea del círculo: " + miobClase4.calcularAreaCirculo(radio));
                } catch (Exception e) {
                    // Si el usuario ingresa un invalor válido de radio
                    System.out.print("\nValor inválido para el radio del círculo: " + e.getMessage());
                }
            } else if (opcion == 3) {
                System.out.print("\nHas salido del programa.");
                salir = true;
            } else {
                // Si el usuario ingresa un valor inválido del menú
                System.out.print("\n¡Valor inválido!");
            }
        }
    }
}
