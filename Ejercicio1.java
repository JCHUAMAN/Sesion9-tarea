/*
1.- Crear un programa en Java que permita registrar el peso de las n personas en un arreglo de datos. 
Visualizar el peso promedio de las personas. 
*/
package Programa;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        // Solicitar el número de personas
        System.out.print("Ingrese el número de personas: ");
        int n = scanner.nextInt();
        // almacenar los pesos
        double[] pesos = new double[n];
        // en esta variable es para acumular el total de los pesos
        double sumaPesos = 0;
        // Registrar los pesos kg
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el peso de la persona " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
            sumaPesos += pesos[i];
        }
        // Calculamos el promedio
        double promedioPeso = sumaPesos / n;
        // Mostrar el peso promedio de las n personas ingresadas
        System.out.println("El peso promedio es: " + promedioPeso + " kg");

    }
    
}
