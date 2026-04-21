public class MetodoBurbuja {

    int[] arreglo;
    
    // Constructor
    public MetodoBurbuja(int[] arreglo){
        System.out.println("Se creo la clase Met Burbuja");
        this.arreglo = arreglo;
    }

    public void ordenarAscendente() {
        for(int i = 0; i < arreglo.length; i++){
            for(int j = i + 1; j < arreglo.length; j++){
                if(arreglo[i] > arreglo[j]){
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }

    public void ordenarDescendente() {
        for(int i = 0; i < arreglo.length; i++){
            for(int j = i + 1; j < arreglo.length; j++){
                if(arreglo[i] < arreglo[j]){ 
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }

    public void imprimirArreglo(){
        for(int num : arreglo){
            System.out.print(num + ", ");    
        }
        System.out.println();
    } 
}