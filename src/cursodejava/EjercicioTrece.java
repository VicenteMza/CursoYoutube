/*
 * Ejercicio 13 - Ordenamiento de la Burbuja.
 * Escribir el pseudocódigo y las pruebas de escritorio para realizar el
 * ordenamiento de un vector con 5 números enteros. El usuario ingresa los
 * números que él desea, cree un vector para guardar temporalmente dichos datos
 * y luego realice el ordenamiento del mismo a través del método de la burbuja.
 */
package cursodejava;

public class EjercicioTrece {
    public static void main(String[] args) {
        int numeros[] = {9,3,5,6,0,3,98,34,6,1,8,7,58};
        boolean seguir = false;
        int aux = 0;
        
        System.out.println("Vector original: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.print("[" + numeros[i] + "]");
        }
        System.out.println("");
        // Ordenamiento por burbuja
        do{
            seguir = false;
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] < numeros[i-1]) {
                    aux = numeros[i];
                    numeros[i] = numeros[i-1];
                    numeros[i-1] = aux;
                    seguir = true;
                }
            }
        }while(seguir == true);
        
        System.out.println("Vector ordenado crecientemente: ");
        for (int i = 0; i < numeros.length; i++){
            System.out.print("[" + numeros[i] + "]");
        }
    }
}
