package _1322.Labs.Lab6;

class FibFormula implements FindFib {

    @Override
    public long calculateFib(int n) {
        return (long) (((Math.pow(((1+StrictMath.sqrt(5))/2),n) - Math.pow(((1-StrictMath.sqrt(5))/2),n)))/StrictMath.sqrt(5));
    }
}