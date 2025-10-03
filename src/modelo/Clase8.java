package modelo;

public class Clase8 {
    public static void calcularPago(int tipo, double horas) {
        if (tipo == 1) {
            // Calculo para empleado de planta
            System.out.print("Valor a pagar:" + horas * 20000);
        } else if (tipo == 2) {
            // Calculo para empleado administrativo
            System.out.print("Valor a pagar:" + horas * 10000);
        }

    }
    



}
