package sort;

public class BubbleSort  implements SortAlgorithm {

    @Override
    public void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
/*
    public void sort(int[] arr) {
        boolean swapped = true;

        int length = arr.length;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < length; i++) {
                if (arr[i - 1] > arr[i]) {
                    swap(arr, i - 1, i);
                    swapped = true;
                }
            }
            length--;
        }
    }

    private void swap(int[] tab, int i1, int i2) {
        int tmp = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = tmp;
    }*/


