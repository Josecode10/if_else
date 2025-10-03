package vista;

import java.util.Scanner;
import modelo.Clase7;

public class Vista7 {
    public static void main(String[] args) {
        // Crear objeto scanner
        Scanner miScanner = new Scanner(System.in);
        System.out.print("------ Programa que determinar descuento ------\n");
        // Crear objeto Clase7
        Clase7 miObjeto = new Clase7();
        // Solicitar valor al usuario
        System.out.print("Ingresar consumo: ");
        // Llamar método de la clase
        miObjeto.evaluarConsumo(Double.parseDouble(miScanner.nextLine()));
    }

}
