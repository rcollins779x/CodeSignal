package ArithmaticExpression;

class ArithmaticExpression {
    static void main(String[] args) {
        int a = 8, b = 3, c = 2;
        System.out.println(arithmeticExpression(a,b,c));
    }
    static boolean arithmeticExpression(double a, double b, double c) {
        System.out.println("(a + b = c) = " + (a + b == c));
        System.out.println("(a - b = c) = " + (a - b == c));
        System.out.println("(a * b = c) = " + (a * b == c));
        System.out.println("(a / b = c) = " + (a / b == c));
        return a + b == c || a - b == c || a * b == c || a / b == c;
    }
}
