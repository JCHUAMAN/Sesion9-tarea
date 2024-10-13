/*
Crear un programa en Java que permita almacenar cinco números en el arreglo  
a y b. Visualizar los valores del arreglo a y b en forma intercalada al arreglo c.
a=10 20 30 40 50
b=60 70 80 90 100
c=10 60 20 70 30 80……100
 */
package Programa;
public class Ejercicio5 {
     public static void main(String[] args) {
        // Crear dos arreglos a y b de tamaño 5
        int[] a = {10, 20, 30, 40, 50};
        int[] b = {60, 70, 80, 90, 100};

        // Crear un arreglo c de tamaño 10 (para intercalar los valores de a y b)
        int[] c = new int[10];

        // Intercalar los valores de a y b en el arreglo c
        for (int i = 0; i < 5; i++) {
            c[2 * i] = a[i];      // Asigna el valor de a[i] a la posición par en c
            c[2 * i + 1] = b[i];  // Asigna el valor de b[i] a la posición impar en c
        }

        // Mostrar los valores del arreglo c intercalados
        System.out.println("Valores del arreglo c intercalados:");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
