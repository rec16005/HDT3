//Clase extraída de: http://www.programcreek.com/2012/11/quicksort-array-in-java/

import java.util.ArrayList;
import java.util.Random;

public class QuickSort {

    public QuickSort() {
    }

    public int[] quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
                return arr;

        if (low >= high)
                return arr;
        //Selecciona el pivote
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        //busca y compara entre las particiones con el pivote
        int i = low, j = high;
        while (i <= j) {
                while (arr[i] < pivot) {
                        i++;
                }

                while (arr[j] > pivot) {
                        j--;
                }

                if (i <= j) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        i++;
                        j--;
                }
        }
        //Recursiva de listas mas pequeñas
        if (low < j)
                quickSort(arr, low, j);

        if (high > i)
                quickSort(arr, i, high);

        return arr;
    }
}
