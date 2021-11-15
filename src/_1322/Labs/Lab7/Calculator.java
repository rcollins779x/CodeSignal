package _1322.Labs.Lab7;

class Calculator implements CalcOp {
    @Override
    public String add(double a, double b) {
        return a + " + " + b + " = " + (a + b);
    }

    @Override
    public String subtract(double a, double b) {
        return a + " - " + b + " = " + (a - b);
    }

    @Override
    public String multiply(double a, double b) {
        return a + " * " + b + " = " + (a * b);
    }

    @Override
    public String divide(double a, double b) {
        String result = a + " / " + b + " = " ;
        double answer = a/b;
            //If no remainder, return from here
        if((a%b) == 0) return result + answer;
            //Convert decimal to integer
        while (a-(int)a + b-(int)b != 0) {
            a*=10;
            b*=10;
        }
            //Reduce fraction
        int gdc = GCD(a,b);
        a/= gdc;
        b/= gdc;

            //Store whole number for the final answer
        result += ((int)(a / b) == 0 ? "" : (int)(a / b) + " ") +
                (int)(a%b) + "/" + (int) b + " Decimal: " + answer;
        return result;
    }

    private int GCD(double a,double b) {
        while (a != b)
            if(a > b) a -= b;
            else b -= a;
        return (int)a;
    }
}
