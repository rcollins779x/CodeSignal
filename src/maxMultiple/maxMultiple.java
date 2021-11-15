package maxMultiple;

class maxMultiple {
    static void main(String[] args) {
        int divisor = 3, bound = 10;
        System.out.println(maxMultiple(divisor,bound));
    }
    static int maxMultiple(int divisor, int bound) {
        return bound/divisor*divisor;
    }
}
