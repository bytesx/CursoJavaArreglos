public class Arreglos3 {
    public static void main(String[] args) {

        // Insertar Valores en Arreglos

        int valores [] = new int[10];

        for (int indice = 0; indice < valores.length; indice++) {
            valores[indice] = indice;
        }
        for (int valor: valores) {
            System.out.println(valor);

        }
    }
}
