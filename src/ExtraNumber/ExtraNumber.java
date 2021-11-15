package ExtraNumber;

class ExtraNumber {
    static void main(String[] args) {
        int a=2, b=7, c=2;
        System.out.println(extraNumber(a,b,c));
    }
    static int extraNumber(int a, int b, int c) {
        if(a == b) return c; else if (a == c) return b; else return a;
    }
}
