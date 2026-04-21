public class App {
    public static void main(String[] args) throws Exception {
        metodoBurbuja();
        runMetodoBurbujaAVanzado();
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

    private static void runMetodoBurbujaAVanzado() {
        int[] arreglo = new int[]{50, 5, 20, 30, 0, -10, 15};

        MetodoBurbujaAVanzado mBurbujaAVanzado = new MetodoBurbujaAVanzado(arreglo);

        mBurbujaAVanzado.printArreglo();

        mBurbujaAVanzado.sort(true);
        mBurbujaAVanzado.printArreglo();

        mBurbujaAVanzado.sort(false);
        mBurbujaAVanzado.printArreglo();
    }
}