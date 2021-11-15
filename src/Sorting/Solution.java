package Sorting;

import java.io.IOException;
import java.util.Arrays;

class Solution {
    static void main(String[] args) throws IOException {

        int n = 4;
        int []a = {4,3,1,2};

        System.out.println(Arrays.toString(a));
        for (int numberOfSwaps = 0, i = 0; i < n; i++) {   // Track number of elements swapped during a single array traversal
            for (int j = 0; j < n - 1; j++) // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    System.out.println(++numberOfSwaps + "\t" + Arrays.toString(a));
                }
            if (numberOfSwaps == 0) {
                System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
                System.out.println("First Element: " + a[0]);
                System.out.println("Last Element: " + a[n-1]);

                break;  // If no elements were swapped during a traversal, array is sorted
            }
        }
    }
}
