package modelo;

public class Clase3 {
    public void evaluarNumeros(int a, int b, int c) {
        if (a == b && a == c) {
            System.out.print("Los número son iguales.");
        }
        if (a > b && a > c) {
            if (b > c) {
                System.out.print("Número mayor: " + a + "\nNúmero menor: " + c);                
            } else if (c > b) {
                System.out.print("Número mayor: " + a + "\nNúmero menor: " + b);                
            } else if (b == c) {
                System.out.print("Número mayor: " + a + "\nLos otros números son iguales");                
            }
        }
        
        if (b > a && b > c) {
            if (a > c) {
                System.out.print("Número mayor: " + b + "\nNúmero menor: " + c);                
            } else if (c > a) {
                System.out.print("Número mayor: " + b + "\nNúmero menor: " + a);
            } else if (a == c) {
                System.out.print("Número mayor: " + b + "\nLos otros números son iguales");                
            }
        }
        
        if (c > a && c > b) {
            if (a > b) {
                System.out.print("Número mayor: " + c + "\nNúmero menor: " + b);                
            } else if (b > a) {
                System.out.print("Número mayor: " + c + "\nNúmero menor: " + a);
            } else if (a == b) {
                System.out.print("Número mayor: " + c + "\nLos otros números son iguales");                
            }
        }
    }

}
