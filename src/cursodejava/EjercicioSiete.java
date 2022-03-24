/*
 * Ejercicio 7 - Repetitiva Hacer Mientras (Do While).
 * Diseñar un algoritmo que muestre por pantalla la tabla de multiplicación del
 * número que ingrese el usuario. Para definir hasta que número desea que
 * muestre la tabla de multiplicación el usuario también deberá ingresar este
 * valor. La tabla de multiplicación a mostrar debe empezar en la multiplicación
 *por 1.
 */
package cursodejava;

import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = 1;
        
        System.out.print("Ingrese el numero a multiplicar: ");
        long nummulti = in.nextLong();
        System.out.print("Ingrese el numero hasta el que desea multiplicar: ");
        long numhasta = in.nextLong();
        
        if(nummulti == 0 || numhasta == 0){
            System.out.println("Culquier numero multiplcado por 0 da  cero.");
            return;
        }
            System.out.println("La multiplicacion hasta " + 
                                numhasta + " es: ");
      
        do{
            System.out.println(nummulti + " x " + i + " = " + (nummulti * i));
            i++;
        }while(i <= numhasta);
    }
}
