package ArrayMaxConsecutiveSum;

import java.util.ArrayList;
import java.util.Arrays;

class ArrayMaxConsecutiveSum {
    static void main (String[] args) {
        int[] inputArray = {1, 3, 4, 2, 4, 2, 4,1};
        int k = 3;
        System.out.println(arrayMaxConsecutiveSum(inputArray,k));
    }
    static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int max = Integer.MIN_VALUE, sum = 0;
            for (int i = 0; i < inputArray.length; i++) {
                sum += inputArray[i] - ((i>=k) ? inputArray[i-k] : 0);
                max = Math.max(max,sum);
            }
        return max;
    }
}
