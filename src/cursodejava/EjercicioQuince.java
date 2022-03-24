/*
 * Ejercicio 15 - Búsqueda Secuencial.
 * Escribir el pseudocódigo y las pruebas de escritorio para realizar la
 * búsqueda del nombre de un cliente en un vector que contiene 5 clientes en
 * total. El cliente a buscar será ingresado por pantalla por el usuario. El
 * algoritmo deberá devolver, en caso de que ese nombre exista, la posición en
 * donde se encuentra dicho cliente dentro del vector.
 */
package cursodejava;

import java.util.Scanner;

public class EjercicioQuince {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // String nombres[] = new String [5];
        String nombres[] = {"vicente", "David", "Julia", "florencia", "Carlos"};
        String nombre = "";
        int i = 0;
        boolean no = false;
        /*
        System.out.println("Liste de nombres: ");
        for (i = 0; i < nombres.length; i++) {
            System.out.print("ingrese nombres: ");
            nombres[i] = in.nextLine();
        }
        */
        System.out.println("");
        System.out.println("Ingrese el nombre a buscar: ");
        nombre = in.nextLine();
        nombre = nombre.replaceAll("\\s","");
        // Busqueda secuencial
        for (i = 0; i < nombres.length; i++) {
          
            if (nombre.equalsIgnoreCase(nombres[i])) {
                System.out.println("'" + nombre + "'" + " se encuntra en al"
                        + " posicion: " + (i + 1));
                no = true;
            }    
        }
        if (no == false) {
            System.out.println("");
            System.out.println("'" + nombre + "'" + "No se encuentra en la"
                        + " lista");
        }
        

    }
}
