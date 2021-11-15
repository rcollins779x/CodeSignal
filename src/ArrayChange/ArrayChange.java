package ArrayChange;

import java.util.Arrays;

class ArrayChange {
    static void main (String [] args) {
        int[] inputArray = {2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15};
        System.out.println(arrayChange(inputArray));
    }
    static int arrayChange(int[] inputArray) {
        int moves = 0;
        for (int i = 1, diff; i < inputArray.length; i++) {
            if(inputArray[i] <= inputArray[i-1]) {
                moves += diff = inputArray[i-1] + 1 - inputArray[i];
                inputArray[i] += diff;
            }
        }
        return moves;
    }
}
