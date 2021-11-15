package ABSsumMIN;

class ABSsumMIN {
    public static void main(String[] args) {
        int[] a = {2, 4, 7};
        System.out.println(absoluteValuesSumMinimization(a));
    }
    static int absoluteValuesSumMinimization(int[] a) {
        int index = -1, sum1 = 0, sum2 = Integer.MAX_VALUE;
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) sum1 += Math.abs(a[j] - a[i]);
            if(sum1<sum2) {
               index = a[j];
               sum2 = sum1;
            }
            //System.out.println("sum1 = " + sum1);
            sum1 = 0;
        }
        return index;
    }
}
