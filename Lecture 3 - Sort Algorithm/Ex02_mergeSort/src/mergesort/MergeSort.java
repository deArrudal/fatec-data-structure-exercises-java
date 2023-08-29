package mergesort;

public class MergeSort {
    public MergeSort() {
        super();
    }

    public int[] sort(int[] array) {
        int size = array.length;
        return mergeSplit(array, 0, size - 1);
    }

    private int[] mergeSplit(int[] array, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2; // compute middle index.

            mergeSplit(array, left, mid); // left-side recursive call.
            mergeSplit(array, mid + 1, right); // right-side recursive call.

            mergeJoin(array, left, mid, right);
        }

        return array;
    }

    private void mergeJoin(int[] array, int left, int mid, int right) {
        int[] tmp = new int[array.length]; // auxiliary array.

        int i = left;
        int j = mid + 1;
        int k = left;

        while ((i <= mid) && (j <= right)) {
            if (array[i] < array[j]) {
                tmp[k] = array[i];
                i++;
                k++;
            } else {
                tmp[k] = array[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            tmp[k] = array[i];
            i++;
            k++;
        }

        while (j <= right) {
            tmp[k] = array[j];
            j++;
            k++;
        }

        for (i = left; i < k; i++) {
            array[i] = tmp[i];
        }
    }
}
