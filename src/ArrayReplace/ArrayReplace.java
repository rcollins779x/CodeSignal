package ArrayReplace;

import java.util.Arrays;

class ArrayReplace {
    static void main (String[] args) {
        /*inputArray:
        [1, 2, 3, 4, 5]
    elemToReplace: 3*/
        int[] inputArray = {1,2,3,4,5};
        int elemToReplace = 3;
        int substitutionElem = 0;
        System.out.println(Arrays.toString(substitutionElem(inputArray, elemToReplace, substitutionElem)));
    }

    private static int[] substitutionElem(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int j = 0; j < inputArray.length; j++)
            if (inputArray[j] == elemToReplace) inputArray[j] = substitutionElem;
        return inputArray;
    }

}
