package _1322.Labs.Lab6;

class FibIteration implements FindFib {

    @Override
    public long calculateFib(int n) {
        long  n1=1, n2=0, n3=0;
        for (int i = 0; i < n; i++ )
            if (n > 1) {
                n3 = n2 + n1;
                n1 = n2;
                n2 = n3;
            }
        return n3;
    }
}