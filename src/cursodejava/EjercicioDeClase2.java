/*
 *  Relizar un programa que pida la cotizacion de dolar para los 5 dias de la semana
 * Mostras el valor promedio de la semana.
 * El dia y el valor que fue minima, y el dia y valor que fue max.
 */
package cursodejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EjercicioDeClase2 {
    
//    public static double promedio(int[] dolar){
//        double promedio = 0;
//        for (int i : dolar) {
//            promedio += i;
//        }
//         
//        return promedio = promedio/dolar.length;
//    }
//    
//    public static void diaMax(String[] dias, int[] dolar){
//        int dMax =0;
//        int indice = 0;
//        
//        for (int i = 0; i < dolar.length; i++) {
//            if (dolar[i] > dMax) {
//                dMax = dolar[i];
//                indice = i;
//
//            }
//        }
//        System.out.println("El dia " + dias[indice] + " el mayor valor del dolar durante"
//                + " la semana fue: " + dMax);
//    }
//    
//    public static void diaMin(String[] dias, int[] dolar){
//        int dMin = dolar[0];
//        int indice = 0;
//        
//        for (int i = 0; i < dolar.length; i++) {
//            if (dolar[i] < dMin) {
//                dMin = dolar[i];
//                indice = i;
//
//            }
//        }
//        System.out.println("El dia " + dias[indice] + " el menor valor del dolar durante"
//                + " la semana fue: " + dMin);
//    }

    public static void main(String[] args) {
        //Secuencial:
        
//        Scanner in = new Scanner(System.in);
//        String dias[] = {"lunes", "martes", "miercoles", "jueves", "viernes"};
//        int dolar[] = {201, 210, 219, 201, 205};
//        double acumulador = 0;
//        int dMax = dolar[0], dMin = dolar[0], indice = 0;
//        int i;
//
////        for (i = 0; i < dias.length; i++) {
////            System.out.println("Ingrese el valor del dolar el dia " + dias[i] + ":");
////            dolar[i] = in.nextInt();
////        }
//        for (i = 0; i < dias.length; i++) {
//            acumulador += dolar[i];
//        }
//        System.out.println("Promedio semanal: " + acumulador / dolar.length);
//
//        for (i = 0; i < dolar.length; i++) {
//            if (dolar[i] > dMax) {
//                dMax = dolar[i];
//                indice = i;
//
//            }
//        }
//        System.out.println("El dia " + dias[indice] + " el valor del dolar fue " + dMax);
//
//        indice = 0;
//        for (int j = 0; j < dolar.length; j++) {
//            if (dolar[j] < dMin) {
//                dMin = dolar[j];
//                indice = j;
//
//            }
//        }
//        System.out.println("El dia " + dias[indice] + " el valor del dolar fue " + dMin);




///////////////////////////////////////////////////////////////////////////////////////////////////



        //Funciones:
        
//        Scanner in = new Scanner(System.in);
//        String dias[] = {"lunes", "martes", "miercoles", "jueves", "viernes"};
//        int dolar[] = {201, 210, 219, 201, 205};
//        double acumulador;
//     
//        acumulador = promedio(dolar);
//        System.out.println("El promedio semanal es de:" + acumulador);
//        diaMax(dias, dolar);
//        diaMin(dias, dolar);
        

        
///////////////////////////////////////////////////////////////////////////////////////////////////



            //ArrayList:
            
        ArrayList<String> dias = new ArrayList();
        dias.add("Lunes");
        dias.add("Martes");
        dias.add("Miercoles");
        dias.add("Jueves");
        dias.add("Viernes");

        ArrayList<Integer> dolar = new ArrayList();
        dolar.add(201);
        dolar.add(210);
        dolar.add(219);
        dolar.add(201);
        dolar.add(205);
        
        int mayor = Collections.max(dolar);
        int indice = dolar.indexOf(mayor);
        System.out.println("El valor maximo de USD en la semana fue " + mayor 
        + ", el dia: " + dias.get(indice));
        
        int menor = Collections.min(dolar);
        indice = dolar.indexOf(menor);
         System.out.println("El valor minimo de UkjSD en la semana fue " + menor
        + ", el dia: " + dias.get(indice));
         
         
         double prom = 0;
         for (Integer promedio : dolar) {
            prom += promedio;
        }
         System.out.println("El promedio de la semana es: " + prom/dolar.size());
    }

}
