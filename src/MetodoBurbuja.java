public class MetodoBurbuja {


    int[] arreglo;
    
    // Constructor
    public MetodoBurbuja(){
            System.out.println("Se creo la clase Met Burbuja");
            // 1ra forma
            // Instanciar con valor creado en constructor
            // this.arreglo = new int[]{10, 5, 8, 0, 7};

            // 2da forma
            // Instanciar con valor creado en constructor
            this.arreglo = arreglo;

    }
    public void ordenarAscendente() {
            for(int i = 0; i<arreglo.length; i++){
                for(int j = i+1; j<arreglo.length; j++){
                    if(arreglo[i] > arreglo[j]){
                        int aux = arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j] = aux;
                    }
                }
            }
    }


    public void imprimirArreglo(){
        for(int num : arreglo){
            System.out.println(num + ", ");    
        }
        System.out.println();
    }
}
