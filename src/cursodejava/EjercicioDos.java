/*
 * Escribir un algoritmo que permita loguearse (registrarse) a un sistema,  
 * ingresando un nombre de usuario y la contraseña adecuada. Considerar que
 * tanto el usuario como la contraseña están formados sólo por letras. El
 * sistema deberá validar que el usuario y la contraseña sean correctas,
 * comparándolas con lo que es sistema tiene registrado para ese usuario.
 */
package cursodejava;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioDos {

    public static void main(String[] args) {

        String user = JOptionPane.showInputDialog("Ingresa el usuario");
        String pass = JOptionPane.showInputDialog("Ingresa la contraseña");

        if (user.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Se tienen que llenar ambos"
                    + " campos");
            return;
        }
        // Compara que tanto el usuario o password sean solo letras
        if (user.matches("[A-Za-z]+") && pass.matches("[A-Za-z]+")) {
            
            if (pass.equals("admin") && user.equalsIgnoreCase("Vicente")) {
                JOptionPane.showMessageDialog(null, "Ingreso exitoso");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o Contraseña"
                        + " INCORRECTOS");
            }
        } else {
            JOptionPane.showMessageDialog(null,"Solo se deben ingresas letras");
        }

        /*
         * 
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingrese el usuario: ");
        String user = in.nextLine();

        System.out.println("Ingrese la contraseña");
        String pass = in.nextLine();

        if (user.equals("") || pass.equals("")) {
            System.out.println("Se deben llenar ambos campos");
            return;
        }
        
        if (user.matches("[A-Za-z]+") && pass.matches("[A-Za-z]+")) {
            if (pass.equals("admin") && user.equalsIgnoreCase("Vicente")) {
                System.out.println("Ingreso exitoso");
            } else {
                System.out.println("Usuario o contraseña incorrecto");
            }
        } else {
            System.out.println("Solo se deben ingresas letras");
        }
         */
 /*
        if(user.equals("") || pass.equals("")){
           System.out.println("Se deben llenar ambos campos");
           return;
        }   
        if(!  user.matches("[A-Za-z]+") || !pass.matches("[A-Za-z]+")){
           System.out.println("Solo se deben ingresas letras");
           return;
        }
        
        if(!pass.equals("admin") || !user.equalsIgnoreCase("Vicente")){
           System.out.println("Usuario o contraseña incorrecto");
           return;
        }
           System.out.println("Ingreso exitoso");
         */
    }
}
