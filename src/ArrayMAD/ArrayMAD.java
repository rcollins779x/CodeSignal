package ArrayMAD;

class ArrayMAD {
    static void main (String[] args) {
        int[] array = {-1, 4, 10, 3, -2};
        System.out.println(arrayMaximalAdjacentDifference(array));
    }
    static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < inputArray.length; i++) {
            max = Math.max(Math.abs(inputArray[i]-inputArray[i-1]),max);
        }
        return max;
    }

}
