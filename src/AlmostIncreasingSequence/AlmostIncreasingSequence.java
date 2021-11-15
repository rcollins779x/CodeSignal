package AlmostIncreasingSequence;

class AlmostIncreasingSequence {
    static void main(String[] args) {
        int[] sequence = {4, 1, 2, 3};
        int count = 0;
        /*
        4 >= 1
        4 >= 2
        1 >= 2
        1 >= 3
        2 >= 3
         */
        for(int i = 0, j = 1; j < sequence.length; i++) {
            if(sequence[i] >= sequence[j])
                count++;
            j++;
            if(sequence[i] >= sequence[j])
                count++;
        }
        System.out.println(count);
    }
}
