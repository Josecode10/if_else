package modelo;

public class Clase9 {
    public static void evaluarNumeros(int[] numeros) {
        // Declarar e iniciar arreglos para almacenar los números
        int[] pares = new int[10];
        int[] impares = new int[10];
        // Contador para índices
        var i = 0;
        var j = 0;
        for(int numero: numeros) {
            if (numero%2 == 0) {
                pares[i] = numero;
                ++i;
            } else {
                impares[j] = numero;
                ++j;
            }
        }
        // Imprimier arreglo de pares
        System.out.println("\nArreglo de pares");
        System.out.print("{");
        for(int par: pares) {
            if(par != 0) {
                System.out.print(par + " ");
            }
            ++i;
        }
        System.out.println("}");
        
        // Imprimier arreglo de impares
        System.out.println("\nArreglo de impares");
        System.out.print("{");
        for(int impar: impares) {
            if(impar != 0) {
                System.out.print(impar + " ");
            }
            ++i;
        }
        System.out.println("}");

        // Variables para almacenar resultados de sumas y multiplicación
        int resultadoPares = 0;
        int resultadoImpares = 1;

        for(int par: pares) {
            resultadoPares += par;
        }
        for(int impar: impares) {
            if (impar != 0) {
                resultadoImpares *= impar;
            }
        }

        System.out.print("\nResultado de suma de pares: " + resultadoPares + 
                    "\nResultado multiplicación de impares: " + resultadoImpares +
                    "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }


}
