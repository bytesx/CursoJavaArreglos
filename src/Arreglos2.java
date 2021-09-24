public class Arreglos2 {
    public static void main(String[] args) {
        // Arreglos FOR
        //Apoyarse en atributo lenght

        //FOR EACH

        int calificaciones [] = {9, 8, 7, 10, 10, 9, 8, 8, 10, 9};
        int suma = 0;

        //Suma / Cantidad para obetener calificaciones
//        for (int indice = 0; indice < calificaciones.length; indice++) {

        for (int valorPorIndice: calificaciones) {

            //System.out.println(valorPorIndice);
           suma+= valorPorIndice;
        }
        float promedio = suma / calificaciones.length;
        System.out.println("Su promedio es " + promedio);
    }
}
