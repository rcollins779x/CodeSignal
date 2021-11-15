package ReverseInParetheses;

import java.util.ArrayList;
import java.util.Arrays;

class ReverseParentheses {
    static void main (String[] args) {
        String inputString = "foo(bar(baz))blim";
        reverseInParentheses(inputString);
    }

    static String reverseInParentheses(String inputString) {
        ArrayList<Character> line = new ArrayList<>();
        ArrayList<Character> rev = new ArrayList<>();

        for (int i = 0; i < inputString.length(); i++) line.add(inputString.charAt(i));
        System.out.println(line);

        int closeP;
        int openP;
        do {
            closeP = -1;
            openP = 0;
            for (int i = 0; i < line.size(); i++) {
                if (line.get(i) == ')') closeP = i;
                if(closeP != -1) break;
            }
            if(closeP == -1) break;
            int range = closeP;

            while (openP == 0) {
                if (line.get(--range) == '(') openP = range;
                if (range == 0) break;
            }
            System.out.print(openP+"\t");
            System.out.println(closeP);

            for (int i = closeP - 1; i > openP; i--) rev.add(line.get(i));
            System.out.println(rev);

            for (int j = 0, i = openP + 1; j < rev.size(); j++, i++) line.set(i, rev.get(j));
            rev = new ArrayList<>();

            System.out.println(line);
            System.out.println("Will remove " + line.get(openP) + "\t" + openP);
            System.out.println("Will remove " + line.get(closeP) + "\t" + closeP);

            line.remove(closeP);
            line.remove(openP);
            System.out.println("After: " + line);


        } while (closeP != -1);
        String result = "";
        for (Character character : line) result += character;
        return result;
    }
}
