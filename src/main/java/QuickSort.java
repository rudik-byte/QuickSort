import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] array, int start, int end) {
        if (array.length == 0)
            throw new NullPointerException("Array not be a blank");

        if (start < end) {
            int partitionIndex = separation(array, start, end);

            quickSort(array, start, partitionIndex-1);
            quickSort(array, partitionIndex+1, end);
        }
    }
    public static int separation(int[] array, int start, int end){

        int pivot = array[end];
        int i = (start-1);

        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;

                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        int swapTemp = array[i+1];
        array[i+1] = array[end];
        array[end] = swapTemp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] x = {52, 37, 63, 14, 17, 8, 6, 25};
        System.out.println("Was");
        System.out.println(Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Now");
        System.out.println(Arrays.toString(x));
    }
}
