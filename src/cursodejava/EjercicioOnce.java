/*
 * Diseñar un algoritmo que a partir de una pila inicial de tres elementos
 * devuelva una pila invertida. La pila contiene números enteros como se muestra
 * en la figura. Al comienzo la pila está vacía, se deben apilar los siguientes
 * elementos: 1,2,3 y luego invertir su orden.
 */
package cursodejava;

public class EjercicioOnce {
    public static void main(String[] args){
        int pilaUno[] = new int[3];
        int i;
        
        i = 1;
        do{
            pilaUno[pilaUno.length-i]= i;
            i++;
        }while(i <= pilaUno.length);
        
        System.out.println("Pila original       Pila de salida");
        
        i = 1;
        while(i-1 < pilaUno.length){
        System.out.println(pilaUno[i-1] + "                  "
                + " "  + pilaUno[pilaUno.length-i]);
        i++;
        }
    }
    
}
