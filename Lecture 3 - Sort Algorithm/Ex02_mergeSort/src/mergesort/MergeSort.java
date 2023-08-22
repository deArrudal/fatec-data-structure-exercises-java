package mergesort;

public class MergeSort {
    public MergeSort() {
        super();
    }

    public void classicSort(int[] array) {
        int size = array.length;

        classicSplit(array, 0, size - 1);
    }

    private void classicSplit(int[] array, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2; // compute middle index.

            classicSplit(array, left, mid); // left-side recursive call.
            classicSplit(array, mid + 1, right); // right-side recursive call.

            classicMerge(array, left, mid, right);
        }
    }

    private void classicMerge(int[] array, int left, int mid, int right) {
        int[] tmp = new int[array.length];

        int i = left;
        int j = mid + 1;
        int k = left;

        while((i <= mid) && (j <= right)) {
            if(array[i] < array[j]) {
                tmp[k] = array[i];
                i++;
                k++;
            } else {
                tmp[k] = array[j];
                j++;
                k++;
            }
        }

        while(i <= mid) {
            tmp[k] = array[i];
            i++;
            k++;
        }

        while(j <= right) {
            tmp[k] = array[j];
            j++;
            k++;
        }

        for(i = left; i < k; i++) {
            array[i] = tmp[i];
        }
    }
}
