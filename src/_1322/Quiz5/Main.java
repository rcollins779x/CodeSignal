package _1322.Quiz5;

class Main {

    public static void main(String []args) {
/*
        int number = 10;
        System.out.println( pblmOne(number));
*/
        int num1=1;
        int num2=0;
        System.out.println(pblm2(num1, num2));

    }

    static int pblmOne(int myNum){
        System.out.println("2 + myNum = " + myNum);
        if (myNum < 2)
            return 3;
        else
            return 2 + pblmOne(myNum-2);
    }
    static int pblm2(int a, int b){
        if (a == b)
            return 0;
        else
            return pblm2(a, b + 1) + b;
    }
}


