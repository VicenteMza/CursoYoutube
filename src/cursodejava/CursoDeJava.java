package cursodejava;
//Escribir un algoritmo que permita realizar una suma de dos números enteros. El
//usuario deberá ingresar primero un número, luego el siguiente número, y el 
//sistema arrojará el resultado correspondiente.

import java.util.Scanner;

public class CursoDeJava {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int suma = 0;

        System.out.println("Igresa el primer numero: ");
        int num1 = in.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = in.nextInt();
        suma = num1 + num2;
        
        System.out.println("la suma es igual a: " + suma);
        System.out.printf("La suma de %d + %d es igual a %d\n",num1,num2,suma);
        
        /*
        double x = 1.00001;
        char y = 'A';
        int z = 13;
        String s = "Otro String";

        System.out.printf("Esta es una salida con printf donde x: %.3f %n y = "
                + "       %c%n y z = %d",x,y,z);
        System.out.printf("Este es otro String s: %s",s);
        */
    }

}
