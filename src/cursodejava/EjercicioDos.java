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
 
         //Hecho en clase
         /*
         public static boolean esValido(String user, String pass) {
        String nombreUsuarioCorrecto = "gmmaunas";
        String contraseniaUsuarioCorrecta = "0qwerty1";
        boolean esCorrecto = false;
        if ((nombreUsuarioCorrecto.equals(user))
                && (contraseniaUsuarioCorrecta.equals(pass))) {
            esCorrecto = true;
        }
        return esCorrecto;

    }

    public static void main(String[] args) {

        Scanner leerEntrada = new Scanner(System.in);

        System.out.println("Ingrese el nombre de Usuario");

        String nombreUsuario = leerEntrada.next();

        System.out.println("Ingrese la contraseña de Usuario");

        String contraseniaUsuario = leerEntrada.next();

        if (nombreUsuario.equals("gmmaunas") && contraseniaUsuario.equals("0qwerty1")) {

            System.out.println("nombre y contraseña de Usuario CORRECTAS");

        }

        if (esValido(nombreUsuario, contraseniaUsuario)) {
            System.out.println("nombre y contraseña de Usuario CORRECTAS");
        }
        
        System.out.println(esValido(nombreUsuario, contraseniaUsuario));
         */
    }
}
