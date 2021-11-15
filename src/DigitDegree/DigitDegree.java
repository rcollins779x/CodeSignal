package DigitDegree;

class DigitDegree {
    static void main (String[] args) {
        int n = 877;
        System.out.println(digitDegree(n));
    }

    static int digitDegree(int n) {
        int degree = 0, temp = 0;
        while (n > 9) {
            degree++;
            for (int i = 0; i < String.valueOf(n).length(); i++)
                temp += Integer.parseInt(String.valueOf(String.valueOf(n).charAt(i)));
            n = temp;
            temp = 0;
        }
        return degree;
    }

}
