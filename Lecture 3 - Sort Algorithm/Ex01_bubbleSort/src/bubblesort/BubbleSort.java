package bubblesort;

public class BubbleSort{
    public BubbleSort() {
        super();
    }

    public void classicSort(int[] array) {
        int size = array.length;
        int tmp;

        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size - 1; j++) {
                if(array[j] > array[j + 1]) {
                    tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public void optimizedSort(int[] array) {
        boolean flag_end; // Flag end of sort procedure.
        int size = array.length;
        int tmp;

        do {
            flag_end = true; // Reset.

            for (int i = 1; i <= (size - 1); i++) {
                if (array[i - 1] > array[i]) {
                    tmp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = tmp;

                    flag_end = false;
                }
            }

            size--; // Decrease loop's upper limit.

        } while (!flag_end);
    }
} 