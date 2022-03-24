/* Ejercicio 12 - Ordenamiento por Inserción.
 * Escribir el pseudocódigo y las pruebas de escritorio para realizar el
 * ordenamiento de un vector con 5 números enteros. El usuario ingresa los
 * números que él desea, cree un vector para guardar temporalmente dichos datos
 * y luego realice el ordenamiento del mismo por inserción.
*/
package cursodejava;

import java.util.Scanner;

public class EjercicioDoce {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor = 0;
        int vector[] = new int[5];
        int aux, pos;
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un valor");
            valor = in.nextInt();
            vector[i] = valor;
        }
        
        System.out.println("Vector origunal ");
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print("[" + vector[i] + "]");
        }
        
        for (int i = 0; i < vector.length; i++) {
            aux = vector[i];
            for (int j = 1; j < vector.length; j++) {
                if (vector[i] > vector[j]) {
                    vector[i] = vector[j];
                     vector[j] = aux;
                }
            }
            
        }
       
        System.out.println("");
        System.out.printf("Vector ordenado creciente:\n");
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print("[" + vector[i] + "]");
        }
        
        System.out.println("");
        System.out.println("Vector ordenado decreciente:");
        for (int i = 0; i < vector.length; i++) {
            
            System.out.print("[" + vector[(vector.length-1) - i] + "]");
        }
    }
     
}
