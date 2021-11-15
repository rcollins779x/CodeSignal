package PalindromeSort;

import java.util.ArrayList;

class palindromeRearranging {
    static void main (String[] args) {
        String inputString = "asdfdsa";
        palindromeRearranging(inputString);
    }
    static boolean palindromeRearranging(String inputString) {
        ArrayList<Character> checker = new ArrayList<>();
        checker.add(inputString.charAt(0));
        int i = 0;
            //Choose unique chars in String
        while (i < inputString.length()) {
            //System.out.println("CharAt("+i+"): "+inputString.charAt(i));
            int index = 0;
            while (index <= checker.size()) {
                if(checker.size()==index) checker.add(inputString.charAt(i));
                if (checker.get(index)==inputString.charAt(i)) break; else index++;
            }
            i++;
        }
        System.out.println(checker);
        System.out.println(inputString.length()%2);
        int odd = 0;
        for (i = 0; i < checker.size(); i++) {
            int count = 0;
            System.out.print("Checker.get: " +i+"-"+ checker.get(i));
            for (int j = 0; j < inputString.length(); j++) {
                System.out.print("\tCharAt: "  +j+"-"+ inputString.charAt(j));
                if(checker.get(i) == inputString.charAt(j)) count++;
            }
            System.out.print("\tFinal count: " + count);
            if (inputString.length() % 2 == 0) if (count % 2 == 1) return false;
            if (inputString.length() % 2 == 1 && count % 2 == 1) odd++;
            System.out.println("\tFinal odd: " + odd);
            if (odd > 1) return false;
        }
        return true;
    }
}
