/*
Crear un programa en Java que permita registrar el ingreso económico de las n personas 
en un arreglo de datos. Visualizar ingreso promedio, ingreso mayor de las personas.
 */
package Programa;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {        
        Scanner scanner= new Scanner(System.in);
        // Solicitar el número de personas
        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();
        double[] ingresos = new double[n];
        // Variables para acumular el total de ingresos y encontrar el mayor ingreso
        double sumaIngresos = 0;
        double mayorIngreso = 0;
        // Registrar los ingresos
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el ingreso de la persona " + (i + 1) + ": ");
            ingresos[i] = scanner.nextDouble();
            sumaIngresos += ingresos[i];
            // Comparar para encontrar el mayor ingreso
            if (ingresos[i] > mayorIngreso) {
                mayorIngreso = ingresos[i];
            }
        }
        // Calcular el promedio
        double promedioIngreso = sumaIngresos / n;
        // Mostrar el ingreso promedio y el mayor ingreso
        System.out.println("El ingreso promedio es: " + promedioIngreso + " Soles");
        System.out.println("El mayor ingreso es: " + mayorIngreso + " Soles");
    }
}