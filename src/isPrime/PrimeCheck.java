package isPrime;

class PrimeCheck {
    private static int check = 0,check2 = 0;
    private static int post = 0,post2 = 0;
    private static int total = 0,total2 = 0;
    static void main(String[] args) {
        int [] array = {12,5,7};

        for (int i = 2; i < array.length; i++) {
            //int num = array[i];
            if (isPrime(i)) System.out.println(i + " Prime " + ++total);
            //else System.out.println("Not prime");
        }
        System.out.println("Check: " + check + " Post: " + post);
    }

    private static boolean isPrime(int num) {
        if (num % 2 == 0 && num != 2) {
            check ++;
            return false;
        } else if (num % 5 == 0 && num != 5) {
            check ++;
            return false;
        }
        for(int i = 3; i < num; i+=2, post++) {
            check++;
            if (num % i == 0) return false;
        }
        return true;
    }
}
