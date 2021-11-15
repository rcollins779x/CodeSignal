package MissingStatues;

class Statues {
    static void main(String[] args) {
        int[] array = {6, 2, 3, 8};
        makeArrayConsecutive2(array);
        for (int j : array) {
            System.out.println(j);
        }
    }
    static int makeArrayConsecutive2(int[] statues) {
        sort(statues);
        int total=0;
        for (int i = statues.length-1;i > 0;i--) {
            total += statues[i]-1 - statues[i-1];
        }
        return total;
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
