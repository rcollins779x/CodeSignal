package AvoidObstacles;

class AvoidObstacles {
    static void main (String[] args) {
        int[] array = {1, 4, 10, 6, 2};
        System.out.println(avoidObstacles(array));
    }
    static int avoidObstacles(int[] inputArray) {
        int j= 0;
        boolean check;
        do {
            j++;
            check = true;
            for (int k : inputArray) {
                //System.out.print(j + "|" + k + " != ");
                check = k % j != 0;
                //System.out.println("\t" + check);
                if(!check) break;
            }
        } while (!check);
        return j;
    }

}
