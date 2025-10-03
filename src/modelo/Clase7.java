package modelo;

public class Clase7 {
    public void evaluarConsumo(double consumo) {
        if (consumo > 130000) {
            System.out.print("Valor a pagar: " + consumo * 0.85);
        } else {
            System.out.print("No aplica descuento.");
        }
    }

}
