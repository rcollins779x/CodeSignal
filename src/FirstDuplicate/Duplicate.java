package FirstDuplicate;

class Duplicate {

    static void main(String[] args) {
    int[] a = {1, 1, 2, 2, 1};

        System.out.println("Answer: " + firstDuplicate(a));
    }
    static int firstDuplicate(int[] a) {
    int lowest = Integer.MAX_VALUE;

    for (int j = 0; j < a.length; j++) {
        int value = a[j];
        System.out.println("j: " + j + "-value: " + a[j]);

        for (int i = j + 1; i < a.length; i++)
            if (value == a[i]) {
                if(lowest == j+1) return a[lowest];
                lowest = Math.min(lowest,i);
                System.out.println("lowest: " + lowest);
            }
    }
        if(lowest == Integer.MAX_VALUE) return -1;
        return a[lowest];
    }
}
