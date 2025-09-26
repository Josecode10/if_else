package modelo;

public class Clase2 {
    public int mayorTresNumermos(int a, int b, int c) {
        // Variable para almacenar el número mayor
        int mayor;
        
        // Asignar a como el mayor
        mayor = a;

        if (b > mayor) {
            mayor = b;
        }
        if (c > mayor) {
            mayor = c;            
        }

        return mayor;
    }
}
