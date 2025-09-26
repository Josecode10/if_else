package vista;

import java.util.Scanner;

import modelo.Clase3;

public class Vista3 {
    public static void main(String[] args) {
        // Crear objeto scanner
        Scanner miScanner = new Scanner(System.in);
        // Crear objeto Clase3
        Clase3 objClase3 = new Clase3();

        // Capturar números
        System.out.print("Insertar primer número: ");
        var a = Integer.parseInt(miScanner.nextLine());
        System.out.print("Insertar segundo número: ");
        var b = Integer.parseInt(miScanner.nextLine());
        System.out.print("Insertar tercer número: ");
        var c = Integer.parseInt(miScanner.nextLine());

        // Llamar método
        objClase3.evaluarNumeros(a, b, c);
    }
    
}
