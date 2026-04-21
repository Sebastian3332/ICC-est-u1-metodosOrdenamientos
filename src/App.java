public class App {
    public static void main(String[] args) throws Exception {
        metodoBurbuja();
    }

    public static void metodoBurbuja() {
        System.out.println("Metodo Burbuja");

        int[] arreglo = new int[]{10, -5, 0, 2, 7};
        MetodoBurbuja metodoBurbuja = new MetodoBurbuja(arreglo);

        // Original
        metodoBurbuja.imprimirArreglo();

        // Ascendente
        metodoBurbuja.ordenarAscendente();
        metodoBurbuja.imprimirArreglo();

        // Descendente
        metodoBurbuja.ordenarDescendente();
        metodoBurbuja.imprimirArreglo();
    }
}