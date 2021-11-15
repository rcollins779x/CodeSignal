package IncreasingSequence; // 35/38 tests

import java.util.ArrayList;

class Sequence {
    static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 5, 6};
        System.out.print(almostIncreasingSequence(array));
    }

    static boolean almostIncreasingSequence(int[] sequence) {
        ArrayList<Integer> current = new ArrayList<>();
        ArrayList<Integer> next = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < sequence.length-1; i++) {
            if(sequence[i] > sequence[i+1] && count == 0) {
                count++;
                next.add(sequence[i+1]);
                current.add(sequence[i++]);
            } else {
                next.add(sequence[i]);
                current.add(sequence[i]);
            }
        }
        if(next.size() < sequence.length - count && sequence.length > 2) {
            next.add(sequence[sequence.length - 1]);
            current.add(sequence[sequence.length - 1]);
        }

        System.out.println("current = " + current);
        System.out.println("next = " + next);
        return isIncreasing(current) || isIncreasing(next);
    }
    static boolean isIncreasing(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) if (list.get(i - 1) >= list.get(i)) return false;
        return true;
    }
}