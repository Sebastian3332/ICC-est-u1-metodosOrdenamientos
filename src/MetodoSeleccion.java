public class MetodoSeleccion {

    public void sort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceDelMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceDelMenor]) {
                    indiceDelMenor = j;
                }
            }

        
            int temp = arr[indiceDelMenor];
            arr[indiceDelMenor] = arr[i];
            arr[i] = temp;
        }
    }

    public void sortDes(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceDelMayor = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[indiceDelMayor]) {
                    indiceDelMayor = j;
                }
            }

            
            int temp = arr[indiceDelMayor];
            arr[indiceDelMayor] = arr[i];
            arr[i] = temp;
        }
    }

    public void printArreglo(int[] arr){
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}





