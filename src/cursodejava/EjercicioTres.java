/*
 *  Escribir el algoritmo que, a partir de la cantidad de bancos de un aula y la
 * cantidad de alumnos inscriptos para un curso, permita determinar si alcanzan
 * los bancos existentes. De no ser así, informar además cuantos bancos sería
 * necesario agregar. El usuario deberá ingresar por teclado tanto la cantidad
 * de bancos que tiene el aula, como la cantidad de alumnos inscriptos para el
 * curso.
 */
package cursodejava;

import java.util.Scanner;

public class EjercicioTres {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aux;

        System.out.print("Ingrese la cantidad de bancos en el curso: ");
        int bancos = in.nextInt();
        System.out.print("Ingrese la cantidad de alumnos inscriptos: ");
        int alumnos = in.nextInt();
        System.out.println("");

        if (bancos == alumnos) {
            System.out.println("El curso esta completo, no quedan bancos vacios.");
            return;
        }
        if (alumnos < bancos) {
            aux = bancos - alumnos;
            System.out.println("Todos los alumnos tienen bancos");
            System.out.println("Cantidad de bancos vacios: " + aux);
        } else {
            aux = alumnos - bancos;
            System.out.println("El curso esta completo, \nCantidad de bancos"
                    + " que faltan: " + aux);
        }

    }
}
