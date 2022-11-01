package cursodejava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjercicioDeClase {

    public static void main(String[] args) {
//        String nombres[] = {"vicente", "florEncia", "laura", "marcelo","daina"};
//        int edades[] = {38, 20, 23, 18, 22};
//        Integer numero = 20;
//       
//        for (int i = 0; i < nombres.length; i++) {
//            nombres[i] = nombres[i].toUpperCase();
//            System.out.println("El alumno " + nombres[i] + " tiene " + edades[i]
//                    + " años.");
//        }
//        System.out.println("numero double: " + numero.doubleValue());
//        
//        int entero = numero;
//        System.out.println("entero = " + entero);

//        List<String> alumnos = new ArrayList<>();
//        alumnos.add("motorola");
//        alumnos.add("Martin");
//        alumnos.add("Daiana");
//        alumnos.add("Eva");
//        alumnos.add("Matias");
//        
//        System.out.println(alumnos + "\n");
//        
//        Collections.sort(alumnos);// ordena la lista
//        
//        System.out.println(alumnos + "\n");
//        
//        for (int i = 0; i < alumnos.size(); i++) {
//            System.out.println("Lista alumnos: " + alumnos.get(i));
//        }
//        System.out.println("");
//        
//        for (String alumno : alumnos) {
//            System.out.println(alumno);
//        }
//        
//        if(alumnos.contains("motorola")){//busca un elemento en la lista
//            System.out.println("la marca motorola se encuentra en la lista");
//        }
//        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher("Visit W3Schools!");
//        boolean matchFound = matcher.find();
//        if (matchFound) {
//            System.out.println("Match found");
//        } else {
//            System.out.println("Match not found");
//        }
    String nombre = "Vicente";
    saludar(nombre);
       
    }

    public static void saludar(String nombre) {
        System.out.println("Soy " + nombre + ", soy alumno de la clase de java.");
        
    }
}
