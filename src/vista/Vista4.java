package vista;

import java.util.Scanner;

public class Vista4 {
    public static void main(String[] args) {
        // Crear objeto de la clase scanner
        Scanner miScanner = new Scanner(System.in);

        var opcion = 0;
        System.out.print("""
                \n¿Qué quieres hacer?
                1) Calcular área de un triángulo.
                2) Calcular área de un círculo.
                Escoger una opcion:\s""");
        
        try {
            opcion = Integer.parseInt(miScanner.nextLine());
        } catch (Exception e) {
            System.out.print("");
        }

        if (opcion == 1) {
            
        }

        
    }

}
