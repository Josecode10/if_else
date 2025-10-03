package modelo;

public class Clase6 {
    public void evaluarCondiciones(double temperatura, double presion) {
        if (temperatura <= 100 && presion <= 200) {
            System.out.print("\nLa temperatura es normal.\n");
        } else if (temperatura > 100 && presion <= 200) {
            System.out.print("\n¡Atención, la temperatura es superior a 100 °C!");
        } else if (temperatura <= 100 && presion > 200) {
            System.out.print("\n¡Atención, la presión es superior a 200 pascales!");
        } else if (temperatura > 100 && presion > 200) {
            System.out.print("\n¡Atención, la temperatura es superior a 100 °C y la presión es superior a 200 pascales!");
        }
    }

}
