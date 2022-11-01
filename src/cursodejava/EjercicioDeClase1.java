package cursodejava;

public class EjercicioDeClase1 {

    public static double coincidencias(String adn, String adnCulpable) {
        double aux = 0;

            for (int i = 0; i < adnCulpable.length(); i++) {

                int z = Character.getNumericValue(adn.charAt(i));
                int c = Character.getNumericValue(adnCulpable.charAt(i));
                if (z == c) {
                    aux++;
                }
            }
        return aux;
    }
    

    public static void main(String[] args) {

//        String adnAcusados[][] = {{"pedro", "1110011"}, {"juan", "0011001"}, {"diego", "1111100"}};
//        String adnCulpable = "1011100";
//        
//        for (int j = 0; j < adnAcusados.length; j++) {
//
//            String adn = adnAcusados[j][1];
//            double aux = coincidencias(adn, adnCulpable);
//            System.out.println("Porcentaje de coincidencias en el ADN de " + adnAcusados[j][0]
//                    + ", es de " + (aux * 100) / adnCulpable.length() + "%");
//            
//        }

        //Secuencial
        
        String nombres[] = {"pedro", "juan", "diego"};
        String adn[]= {"1110011", "0011001", "1111100"};
        String adnCulpable = "1011100";
        int aux = 0;

        for (int j = 0; j < adn.length; j++) {

             for (int i = 0; i < adnCulpable.length(); i++) {
                int z = Character.getNumericValue(adn[j].charAt(i));
                int c = Character.getNumericValue(adnCulpable.charAt(i));

                if (z == c) {
                    aux++;
                }
            }
             System.out.println("Porcentaje de coincidencias en el ADN de " +  nombres[j] 
                     + ", es de " + (aux*100)/adnCulpable.length() + "%");
             aux = 0;
        }
    }
}
