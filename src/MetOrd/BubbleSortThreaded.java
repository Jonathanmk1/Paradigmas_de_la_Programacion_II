
package MetOrd;
import java.util.Arrays;

public class BubbleSortThreaded {
    
    public static void main(String[] args) {
        int[] arr = { 9, 3, 5, 1, 7, 4, 8, 2, 6 };
        int n = arr.length;

        // Dividimos el arreglo en dos partes
        int[] arr1 = Arrays.copyOfRange(arr, 0, n / 2);
        int[] arr2 = Arrays.copyOfRange(arr, n / 2, n);

        // Creamos los hilos
        SortThread t1 = new SortThread(arr1);
        SortThread t2 = new SortThread(arr2);

        // Iniciamos los hilos
        t1.start();
        t2.start();

        // Esperamos a que terminen los hilos
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Error");
        }

        // Mezclamos los dos arreglos ordenados
        merge(arr1, arr2, arr);
        
        // Imprimimos el arreglo ordenado
        System.out.println(Arrays.toString(arr));
    }

    // Método para mezclar los dos arreglos ordenados
    private static void merge(int[] arr1, int[] arr2, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }
    }
}

class SortThread extends Thread {
    private int[] arr;

    public SortThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
