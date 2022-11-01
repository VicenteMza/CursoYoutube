/*
 *   Desarrolle un programa que permita ingresar los tiempos de viajes y entregue 
 * el tiempo de viaje expreados en horas:minutos.
 *   El programa deja de ejecutarse cuando se ingresa un 0 (cero).
 */
package cursodejava;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TiempoDeViaje {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minutos = 1;
        int horas = 0;
        int acumulador = 0;
        
        System.out.println("Ingrese un 0 'cero' para terminar.");
        System.out.println("----------------------------------");
        while (minutos != 0) {
            System.out.print("Ingrese la duracion del tramo en minutos: ");

            minutos = in.nextInt();

            acumulador += minutos;
        }

        horas = acumulador / 60;
        acumulador = acumulador - (horas * 60);

        DecimalFormat decimalFormateado = new DecimalFormat("00");
        System.out.println("------------------------------------");
        System.out.println("Tiempo total de viaje: " + horas + ":"
                + decimalFormateado.format(acumulador) + " horas");
    }
}
