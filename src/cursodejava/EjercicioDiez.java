/*
 * Ejercicio 10 - Dos Arreglos.
 * Una escuela tiene un total de 3 aulas con la siguiente capacidad:
 * Sabiendo la cantidad de bancos de cada aula, el usuario deberá ingresar la
 * cantidad de alumnos inscriptos para cursar tercer grado y el sistema deberá
 * determinar qué aula es la indicada para la cantidad ingresada. La escuela ya
 * sabe que la máxima capacidad de sus aulas es de 40 alumnos, por lo tanto, la
 * cantidad de alumnos inscriptos que ingresa el usuario siempre será un número
 * menor o igual a 40.
 */
package cursodejava;

import java.util.Scanner;

public class EjercicioDiez {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String curso[] = {"Azul", "Verde", "Amarillo"};
        int bancos[] = {40, 35, 30};
        int acumulador =1;
        do{
        System.out.println("Ingrese la cantidad de alumnos: ");
        int cantalumnos = in.nextInt();
        System.out.println("-------------------------------------------------");

        if (cantalumnos > 40) {
            System.out.println("No existe capacidad para la cantidad de"
                    + " alumnos ingresada.");
            System.out.println("---------------------------------------------");
            return;
        }
        for (int i = 0; i < bancos.length; i++) {    
            if(cantalumnos <= 40 && cantalumnos > 35){
                if(bancos[i] == 40){
                bancos[i] = bancos[i] - cantalumnos;
                }
            
            }
            if(cantalumnos <= 35 && cantalumnos > 30){
                if(bancos[i] == 35){
                bancos[i] = bancos[i] - cantalumnos;
                }
            }
            if(cantalumnos <= 30 && cantalumnos > 0){
                if(bancos[i] == 30){
                bancos[i] = bancos[i] - cantalumnos;
                }
            }
        }
        for (int i = 0; i < bancos.length; i++) {
            System.out.println("Existen " + bancos[i] + " bancos desocupados "
                              + "en el aula " + curso[i]);
        }
        acumulador++;
        }while(acumulador <= bancos.length);
        
    }

}
