package isReverse;

import java.util.Scanner;

class isReverse {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = scan.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = scan.nextLine();

        if (isRevRec(s1, s2)) {
            System.out.println("Is the reverse.");
        } else System.out.println("Is not the reverse");
    }

    private static boolean isRevRec(String s1, String s2) {
        if(s1.length() == 0) return true;
        if (s1.length() != s2.length()) return false;
        if (s1.charAt(0) != s2.charAt(s2.length() - 1)) return false;
        return isRevRec(s1.substring(1), s2.substring(0, s2.length() - 1));
    }

    private static boolean isRev(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        while (s1.length() > 0) {
            if (s1.charAt(0) != s2.charAt(s2.length() - 1)) return false;
            s1 = s1.substring(1);
            s2 = s2.substring(0, s2.length() - 1);
        }
        return true;
    }
}
