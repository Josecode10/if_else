package modelo;

public class Clase10 {
    public static void calcularTotal(double[] productos) {
        var subtotal = 0;
        for(double producto: productos) {
            subtotal += producto;
        }
        System.out.print("Subtotal: " + subtotal +
                        "\nIva: " + subtotal*0.19 + 
                        "\nTotal: " + subtotal*1.19);
    }

}
