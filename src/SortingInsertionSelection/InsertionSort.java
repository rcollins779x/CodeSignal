package SortingInsertionSelection;

import java.util.Arrays;

class InsertionSort {
    static void main(String[] args) {
        int[] array = {5, 2, 2, 2, 3, 0, 1, 6, 2, 1};

        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertionSort(int[] arr)
    {
        /* Move elements of arr[0..index-1], that are greater than key, to one position ahead of their current position */
        for (int next = 1; next < arr.length; ++next)
            for (int current = next - 1; current >= 0 && arr[current] > arr[next]; arr[current + 1] = arr[next])
                arr[current + 1] = arr[current--];
    }
    static void selectionSort(int[] arr) {
        // One by one move boundary of unsorted subarray
        for (int index = 0; index < arr.length-1; index++) {
            // Find the minimum element in unsorted array
            int minIndex = index;
            for (int remaining = index+1; remaining < arr.length; remaining++)
                if (arr[remaining] < arr[minIndex]) minIndex = remaining;

            // Swap the found minimum element with the first
            // element
            int swap = arr[minIndex];
            arr[minIndex] = arr[index];
            arr[index] = swap;
        }
    }
}
