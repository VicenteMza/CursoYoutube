/*
 * Ejercicio 14 - Ordenamiento por Selección.
 * Escribir el pseudocódigo y las pruebas de escritorio para realizar el
 * ordenamiento de un vector con 5 números enteros. El usuario ingresa los
 * números que él desea, cree un vector para guardar temporalmente dichos datos
 * y luego realice el ordenamiento del mismo a través del método de la burbuja.
 */
package cursodejava;

public class EjercicioCatorce {
    public static void main(String[] args) {
        int numeros[] = {25,1,36,2,87,4,65,2,9};
        int aux = 0;
        System.out.println("");
        System.out.println("Arreglo original");
        for (int i = 0; i < numeros.length; i++) {
         
            System.out.print("[" + numeros[i] + "]");
        }
        // Metodo burbuja
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j < numeros.length-1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    aux = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = aux;
                }
            }
        }
        
        System.out.println("");
        System.out.println("Arreglo ordenado");
        for (int i = 0; i < numeros.length; i++) {
         
            System.out.print("[" + numeros[i] + "]");
        }
    }
    
}
