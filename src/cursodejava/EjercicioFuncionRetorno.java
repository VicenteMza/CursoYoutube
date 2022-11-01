package cursodejava;

import java.time.LocalDateTime;
import java.util.Calendar;

public class EjercicioFuncionRetorno {
    public static String fecha(){
        String fecha = "La fecha de hoy es 20/05/22";
        return fecha;
    }
    public static void main(String[] args) {
        System.out.println(fecha());
    }
}
