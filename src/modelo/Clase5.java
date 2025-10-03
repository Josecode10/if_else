package modelo;

import javax.swing.JOptionPane;

public class Clase5 {
    public void calcularArea(double lado1, double lado2) {
        // Validar que sea positivo
        if (lado1 > 0 && lado2 > 0) {
            System.out.print("\nEl área del triángulo es: " + lado1 * lado2);
        } else {
            System.out.print("\nUno o los dos lado no son positivos.");
        }
    }

}
