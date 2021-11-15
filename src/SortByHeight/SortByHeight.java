package SortByHeight;

import java.util.ArrayList;
import java.util.Arrays;

class SortByHeight {
    static void main (String[] args) {
        int[] line = {-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(sortByHeight(line)));
    }
    static int[] sortByHeight(int[] a) {
        ArrayList<Integer> people = new ArrayList<>();
        for (int k : a) if (k != -1) people.add(k);
        int[] temp = new int[people.size()];
        for(int i = 0;i< people.size();i++) {
            temp[i] = people.get(i);
        }
        sort(temp);
        System.out.println(people);
        System.out.println(Arrays.toString(temp));
        for(int i = 0, j =0;i<a.length;i++) if (a[i] != -1) a[i] = temp[j++];
        return a;
    }
    static void sort(int[] arr) {
        int n = arr.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heap(arr, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heap on the reduced heap
            heap(arr, i, 0);
        }
    }

    static void heap(int[] arr, int n, int i) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heap the affected sub-tree
            heap(arr, n, largest);
        }
    }
}
