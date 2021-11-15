package AlternatingSums;

import java.util.Arrays;

class AlternatingSums {
    static void main (String[] args) {
        int[] a = {50, 60, 60, 45, 70};
        System.out.println(Arrays.toString(alternatingSums(a)));
    }
    static int[] alternatingSums(int[] a) {
        int[] sum = new int[2];
        int j=0;
        for (int i = 0; i < a.length; i++,j = (int)((Math.pow((-1), (i + 1)) + 1) / 2)) sum[j] += a[i];
        return sum;
    }

}
