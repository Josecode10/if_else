package vista;

import java.util.Scanner;

import modelo.Clase8;

public class Vista8 {
    public static void main(String[] args) {
        // Crear objeto scanner
        Scanner miScanner = new Scanner(System.in);
        System.out.print("\n------ Programa que calcular valor de la nómina ------\n");
        try {
            System.out.print("""
                    Ingresar el tipo de trabajador
                    1) Planta
                    2) Administrativo
                    Escoger un valor:\s""");
            var tipo = Integer.parseInt(miScanner.nextLine());
            if (tipo == 1 || tipo == 2) {
                System.out.print("Ingresar cantidad de horas trabajadas: ");
                var horas = Double.parseDouble(miScanner.nextLine());
                // Llamar método estático de la Clase8
                Clase8.calcularPago(tipo, horas);
            } else {
                System.out.println("Valor inválido.");
            }
        } catch (Exception e) {
            System.out.print("Valor de tipo de trabajor u horas no es válido.");
        }
    }

}
