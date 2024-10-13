/*
Crear un programa en Java que permita registrar las compras de los n personas en un arreglo de datos. 
Visualizar el total, promedio y compra mayor y menor.
 */
package Programa;
import java.util.Scanner;
public class Ejercicio3 {
      public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Solicitar el número de personas
        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();
        // Crear un arreglo para almacenar las compras
        double[] compras = new double[n];
        // Variables para acumular el total de compras, y encontrar la mayor y menor compra
        double totalCompras = 0;
        double mayorCompra = Double.MIN_VALUE;
        double menorCompra = Double.MAX_VALUE;
        // Registrar las compras
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el monto de la compra de la persona " + (i + 1) + ": ");
            compras[i] = scanner.nextDouble();
            totalCompras += compras[i];
            // Comparar para encontrar la mayor y menor compra
            if (compras[i] > mayorCompra) {
                mayorCompra = compras[i];
            }
            if (compras[i] < menorCompra) {
                menorCompra = compras[i];
            }
        }
        // Calcular el promedio
        double promedioCompra = totalCompras / n;
        // Mostrar los resultados
        System.out.println("\nResultados:");
        System.out.println("El total de las compras es: " + totalCompras);
        System.out.println("El promedio de las compras es: " + promedioCompra);
        System.out.println("La mayor compra es: " + mayorCompra);
        System.out.println("La menor compra es: " + menorCompra);

    }
}
