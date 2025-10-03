package vista;

import java.util.Scanner;
import modelo.Clase6;

public class Vista6 {
    public static void main(String[] args) {
        // Crear objeto scanner
        Scanner miScanner = new Scanner(System.in);
        // Crear objeto Clase6
        Clase6 miObjeto = new Clase6();
        System.out.print("\n- - - - Programa que evalua presión y temperatura del sistema - - - -\n");
        
        // Solicitar datos al operador
        System.out.print("\nIngresar temperatura del sistema: ");
        var temperatura = Double.parseDouble(miScanner.nextLine());
        System.out.print("Ingresar presión del sistema: ");
        var presion = Double.parseDouble(miScanner.nextLine());
        // Llamar método de la clase
        miObjeto.evaluarCondiciones(temperatura, presion);
    }
}
