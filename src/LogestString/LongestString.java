package LogestString;

import java.util.ArrayList;
import java.util.Arrays;

class LongestString {
    static void main (String[] args) {
        String[] input = {"abacaba", "abacab", "abac", "xxxxxx"};
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(allLongestStrings(input)));
    }
    static String[] allLongestStrings(String[] inputArray) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> length = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();
        for (int i = 0; i < inputArray.length;i++) {
            if (inputArray[i].length()>max) max = inputArray[i].length();
            length.add(inputArray[i].length());
        }
        System.out.println("Full Length: "+ length+ "\nMax: " + max);
        for (int i = 0; i < inputArray.length;i++) {
            if (length.get(i) == max) last.add(inputArray[i]);
        }
        System.out.println("Adjusted Length: " + last);
        String[] longest = new String[last.size()];
        for (int i = 0; i < last.size();i++) {
            longest[i] = last.get(i);
        }
            return longest;
    }

}
