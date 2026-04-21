public class MetodoBurbujaAVanzado {
    
    int[] arreglo;

    public MetodoBurbujaAVanzado(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public void printArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public void sort(boolean asc) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        boolean huboIntercambios;
        
        for(int i = 0; i < tam - 1; i++) {
            huboIntercambios = false;
            for(int j = 0; j < tam - 1 - i; j++) {
                contComparaciones++;
                // Comparacion
                if (asc) {
                    // true ascendente
                    if(arreglo[j] > arreglo[j + 1]) {
                        huboIntercambios = true;
                        contCambios++;
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                    }
                } else {
                    // false descendente
                    if(arreglo[j] < arreglo[j + 1]) {
                        huboIntercambios = true;
                        contCambios++;
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
                    }
                }
            }
                if(!huboIntercambios) {
                    break;
                }
        }


        System.out.println("Comparaciones: " + contComparaciones);
        System.out.println("Cambios: " + contCambios);
    }
}