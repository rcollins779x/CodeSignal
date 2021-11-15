package ExtractEachKth;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class ExtractEachKth {
    static void main(String[] args) {
        int[] inputArray = {1, 2, 1, 2, 1, 2, 1, 2};
        int k=2;
        System.out.println(extractEachKth(inputArray, k));
    }

    static ArrayList<Integer> extractEachKth(int[] inputArray, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if ((i-(k-1)) % k == 0) continue;
            result.add(inputArray[i]);
        }
        return result;
    }
}
