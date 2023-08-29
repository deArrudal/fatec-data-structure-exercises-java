package quicksort;

public class QuickSort {
    public QuickSort() {
        super();
    }

    public int[] sort(int[] array) {
        int size = array.length;
        return hoareMethod(array, 0, size - 1);
    }

    private int[] hoareMethod(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);

            hoareMethod(array, low, pivot);

            hoareMethod(array, pivot + 1, high);
        }

        return array;
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[low + ((high - low) / 2)];
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do { // leftmost element greater than or equal to pivot.
                i++;
            } while (array[i] < pivot);

            do { // rightmost element smaller than or equal to pivot.
                j--;
            } while (array[j] > pivot);

            if (i >= j) {
                return j;
            }

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}