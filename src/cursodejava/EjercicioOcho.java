/*
 * Ejercicio 8 - Repetitiva Para (For).
 * Diseñar un algoritmo que realice el promedio de 4 números. Los números podrán
 * ser decimales y serán ingresados por pantalla por el usuario.
 */
package cursodejava;

import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double prom = 0;
        
        for(int i = 0; i <= 3; i++){
            System.out.println("ingrese un numero: ");
            prom = prom + in.nextDouble();
        }
        System.out.println("el promedio de los numero ingresados es: " +
                           prom/4);
    }
}
