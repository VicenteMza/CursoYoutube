/*
 * Diseñar un algoritmo que devuelva el nombre del mes, a partir del número de 
 * mes, ingresado por teclado, por el usuario. Si el usuario ingresa un número
 * de mes que no exista, se deberá mostrar un mensaje indicando que el número
 * ingresado no es correcto.
 */
package cursodejava;

import java.util.Scanner;


public class EjecicioCinco {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                         "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre"
                         , "Diciembre"};
        
        System.out.println("Ingrese un numero del 1 al 12");
        int num = in.nextInt();
            
        if((num-1) >= 0 && (num-1) <= 11){
            System.out.println("El numero " + num + " corresponde al mes: " + 
                               meses[num-1]);
        }else{
            System.out.println("El numero de mes ingresado es INCORRECTO.");
        }
    }   
}
