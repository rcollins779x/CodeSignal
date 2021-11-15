package addTwoDigits;

class addTwoDigits {
    static void main (String[] args) {
        int n = 29;
        System.out.println(add(n));
    }
    static int add(int n) {
        int d;
        for(d = 0;n > 0;n/=10) d += n%10;
        return d;
    }

}
