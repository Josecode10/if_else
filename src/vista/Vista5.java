package vista;

import java.util.Scanner;

import modelo.Clase5;

public class Vista5 {
    public static void main(String[] args) {
        // Crear objeto scanner
        Scanner miScanner = new Scanner(System.in);
        // Crear objeto de Clase5
        Clase5 mioClase5 = new Clase5();
        System.out.println("""
                \n - - - - - - - - - - - - - - - - - - - - - - - - 
                Programa que calcula area de un rectángulo
                """);

        try {
            // Bloque a ejecutar si los valores son válidos
            // Pedir valores al usuario
            System.out.print("Ingresar primer lado: ");
            var lado1 = Double.parseDouble(miScanner.nextLine());
            System.out.print("Ingresar segundo lado: ");
            var lado2 = Double.parseDouble(miScanner.nextLine());
            // Llamar el método
            mioClase5.calcularArea(lado1, lado2);
        } catch (Exception e) {
            // Valores inválidos
            System.out.println("Valores inválidos: " + e.getMessage());
        }
    }

}
