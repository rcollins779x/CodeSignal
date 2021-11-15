package lineEncoding;

import java.util.Arrays;

class lineEncoding {
    static void main(String[] args) {
        String s = "ssiiggkoook";
        System.out.println(lineEncoding(s));
    }
    static String lineEncoding(String s) {
        s += "_";
        String result = "";
        for (int i = 1, count = 1; i < s.length(); i++)
            if (s.charAt(i - 1) == s.charAt(i)) System.out.println(++count);
            else {
                if (count > 1) {
                    result += count;
                    count = 1;
                    System.out.println("result = " + result);
                }
                result += String.valueOf(s.charAt(i - 1));
            }
        return result;
    }
}
