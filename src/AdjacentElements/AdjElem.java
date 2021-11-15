package AdjacentElements;

class AdjElem {
    static void main(String[] args) {
        int[] input = {5, 1, 2, 3, 1, 4};

        System.out.println(adjacentElementsProduct(input));
    }
    static int adjacentElementsProduct(int[] inputArray) {
        int max;
        int temp = max = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            temp = inputArray[i] * inputArray[i + 1];
            if (temp > max) max = temp;
        }
        return max;
    }
}
