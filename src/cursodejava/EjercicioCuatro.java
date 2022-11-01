/*
 * Diseñar un algoritmo que permita aplicar un descuento del 10% al monto total
 * de una compra si la forma de pago empleada es de contado. El usuario deberá
 * ingresar el monto de la compra realizada y la forma de pago utilizada. Si es
 * contado, deberá aplicar el descuento, sino se deberá mostrar un mensaje
 * informando que para dicha forma de pago no tiene descuento.
 */
package cursodejava;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EjercicioCuatro {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.println("Cual es la forma de pago: ");
        System.out.println("1 para pago de contado.");
        System.out.println("2 para pago con tarjeta.");
          int parametro = in.nextInt();
          double descuento = 0 , monto = 0;
        
        
        if(parametro == 1 || parametro == 2){
            System.out.println("Igrese el monto a pagar:");
            monto = in.nextDouble();
        }else{
            System.out.println("La opcion ingresada es incorrecta");
            return;
        }
        switch (parametro) {
            case 1:
                System.out.println("Pago de contado, se aplica el descuento del"
                                + " 10 %");
                descuento = monto *0.9;
                
                System.out.printf("El pago con descuento para el monto %.2f es"
                        + " %.2f %n: ", monto, descuento);
                
                break;
            case 2:
                System.out.printf("Pago con tarjeta, el moto a pagar es: " + 
                       "%.2f %n",monto);
                break;
            default:
                System.out.println("La opcion ingresada es incorrecta");
        }
        
        
        //Hecho en clase
        /*
        String montoCompraString = JOptionPane.showInputDialog(null, "Ingrese el "
                + "monto total de la compra", "Entrada Monto", -1);

        double montoCompraDouble = Double.parseDouble(montoCompraString);

        String formaDePago = JOptionPane.showInputDialog(null, "Ingrese la forma "
                + "de pago", "Entrada Forma", -1);
        if (formaDePago.equalsIgnoreCase("contado")) {
            DecimalFormat decimalFormateado = new DecimalFormat("####.00");
            double montoConDescuento = montoCompraDouble * 0.9;
            JOptionPane.showMessageDialog(null, "El monto TOTAL con descuento aplicado"
                    + " por forma de pago al contado, es de: "
                    + decimalFormateado.format(montoConDescuento) + " pesos", "Salida", 1);
        } else {
            JOptionPane.showMessageDialog(null, "La forma de pago ingresada no tiene "
                    + "descuento asociado", "Salida", 2);
        }
        */
    }
    
}
