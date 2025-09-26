package vista;

import java.util.Scanner;
import modelo.Clase1;

public class Vista1 {
    public static void main(String[] args) {
        // Crear objeto de la clase scanner
        Scanner miScanner = new Scanner(System.in);
        // Crear objeto de Clase1
        Clase1 objClase1 = new Clase1();

        // Solicitar número al usuario
        System.out.print("Ingresar el número a evaluar: ");
        // Capturar número
        var numero = Integer.parseInt(miScanner.nextLine());

        // Llamar el método
        objClase1.evaluarNumero(numero);
        
    }

}
