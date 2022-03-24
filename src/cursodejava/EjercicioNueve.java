/*Ejercicio 9 - Arreglo Booleano.
 * Diseñar un algoritmo que recorra las butacas de una sala de cine y determine
 * cuántas butacas desocupadas hay en la sala. Suponga que inicialmente tiene
 * un array (arreglo) con valores booleanos que si es verdadero(verdadero)
 * implica que está ocupada y si es falso(falso) la butaca está desocupada.
 * Tenga en cuenta que el array deberá ser creado e inicializado al principio
 * del algoritmo.
 */
package cursodejava;

import java.util.Scanner;

public class EjercicioNueve {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean butacas[] = new boolean[30];
        int numbutacas = 0, accion = 0;
       
        for (int i = 1; i <= butacas.length; i++){
            butacas[i-1] = false;
        }
        
        do{
        
        System.out.println("");
        System.out.println("Ingrese 1 para ocupar un lugar en la sala ");
        System.out.println("Ingrese 2 para desocupar un lugar en la sala");
        System.out.println("Ingrese 3 para ver cuantos lugares quedan en la" +
                          " sala");
        System.out.println("Ingrese 4 para salir");
        accion = in.nextInt();
       
        switch (accion){
            case 1:
                System.out.println("ingrese el numero de butaca a cargar");
                numbutacas = in.nextInt();
                if(numbutacas >= 1 && numbutacas <= 30){
                    butacas[numbutacas-1] = true;
                    System.out.println("");
                    System.out.println("Carga exitosa");
                    System.out.println("");
                }else{
                    System.out.println("");
                    System.out.println("numero de butaca incorrecto");
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Ingrese el numero de butaca a desocupar");
                numbutacas = in.nextInt();
                if(numbutacas >= 1 && numbutacas <= 30){
                    butacas[numbutacas-1] = false;
                    System.out.println("");
                    System.out.println("Borrado exitoso");
                    System.out.println("");
                }else{
                    System.out.println("");
                    System.out.println("numero de butaca incorrecto");
                    System.out.println("");
                }
                break;
            case 3:
                int i = 1;
                numbutacas = 0;
                while(i <= butacas.length){
                    if(butacas[i-1] == false){
                        numbutacas++;
                    }
                    i++;
                }
                    System.out.println("");
                    System.out.println("Existen " + numbutacas + " butacas vacias");
                    System.out.println("");
                break;     
            default:
                if(accion != 4){
                    System.out.println("");
                    System.out.println("Opciones Incorrecta");
                    System.out.println("");
                }
        }
        }while(accion != 4);
    }
    
}