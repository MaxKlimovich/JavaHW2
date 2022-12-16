import java.lang.reflect.Array;
import java.util.Random;

public class program {

    static int[] createArray(int size){
        int[] array = new int[size];
        return array;
    }
    
    static int[] array(int[] array, int min, int max){
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(min, max);
        }
        return array;
    }

    static String printArray(int[] array){
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                result += array[i];
            } else result += array[i] + ", ";
        }
        result += "]";
        return result;
    }

    static void mergeSort(int[] array){
        int n = array.length;
        if (n == 1) return;

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                array[index] = left[i];
                i++;
                index++;
            } else {
                array[index] = right[j];
                j++;
                index++;
            }
        }

        for (int ll = i; ll < left.length; ll++){
            array[index] = left[ll];
            index++;
        }

        for (int rr = j; rr < right.length; rr++){
            array[index] = right[rr];
            index++;
        }
        main.result = printArray(array);
    }


}