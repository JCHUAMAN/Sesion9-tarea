/*
Crear un programa en Java que permita almacenar en un arreglo de datos cinco
nombres de personas ingresadas y realizar una búsqueda mediante un nombre ingresado.
Visualizar un mensaje indicando si la persona existe o no existe 
y la posición del número en el arreglo de datos.
 */
package Programa;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para almacenar los nombres
        String[] nombres = new String[5];
        // Registrar los cinco nombres
        System.out.println("Ingrese cinco nombres:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }
        // Solicitar el nombre a buscar
        System.out.print("\nIngrese el nombre que desea buscar: ");
        String nombreBuscado = scanner.nextLine();
        // Variable para indicar si se encontró el nombre
        boolean encontrado = false;
        // Buscar el nombre en el arreglo
        for (int i = 0; i < 5; i++) {
        if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
  System.out.println("La persona " + nombreBuscado + " existe y está en la posición " + (i + 1) + " del arreglo.");
                encontrado = true;
                break;
            }
        }
        // Si no se encontró el nombre
        if (!encontrado) {
            System.out.println("La persona " + nombreBuscado + " no existe en el arreglo.");
        }
       }
}
