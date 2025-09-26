package vista;

import java.util.Scanner;

import modelo.Clase2;

public class Vista2 {
    public static void main(String[] args) {
        // Crear objeto de la clase scanner
        Scanner miScanner = new Scanner(System.in);
        // Crear objeto de Clase2
        Clase2 objClase2 = new Clase2();
        
        System.out.print("Ingresar primer número: ");
        var a = Integer.parseInt(miScanner.nextLine());
        
        System.out.print("Ingresar segundo número: ");
        var b = Integer.parseInt(miScanner.nextLine());
        
        System.out.print("Ingresar tercer número: ");
        var c = Integer.parseInt(miScanner.nextLine());

        var resultado = objClase2.mayorTresNumermos(a, b, c);

        System.out.println("El número mayor es : " + resultado);
    }

}
