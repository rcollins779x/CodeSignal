package BitwiseAND;

import java.util.Scanner;

import static java.lang.Integer.toBinaryString;

class BitwiseAND {
    static int And(String N, String test) {
        String result = "";
        for (int i = 0; i <= N.length(); i++) {
            System.out.println(Integer.parseInt(test.substring(i)) + " == " + Integer.parseInt(N.substring(i)));
            if (Integer.parseInt(test.substring(i, i)) == 1 &&
                    Integer.parseInt(N.substring(i)) == 1) result += "1";
            else result += "0";
    }
        System.out.println("Res: " + result);
        return Integer.parseInt(result, 10);
    }

    static int bitwiseAnd(int N, int K) {
        String largest = toBinaryString(N);
        int max = 0, current;
        for (int i = N; i > 0; i--) {
            String temp = "";
            while (temp.length() + toBinaryString(i).length() < largest.length()) temp += "0";
            temp += toBinaryString(i);
            System.out.println(i + ": " + temp);

            current = And(largest, temp);
            max = current < K ? Math.max(max, current) : max;
        }
        return max;
    }

    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(bitwiseAnd(scan.nextInt(), scan.nextInt()));
        }
    }
}
