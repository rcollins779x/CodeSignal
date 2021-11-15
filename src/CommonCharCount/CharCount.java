package CommonCharCount;


class CharCount {
    static void main (String[] args) {
        String s1 = "aabcc", s2 = "adcaa";
        System.out.println(commonCharacterCount(s1,s2));
    }
    static int commonCharacterCount(String s1, String s2) {
        int result = s1.length(), i=0;
        while (i < s1.length())
            if (s2.contains(String.valueOf(s1.charAt(i)))) {
                s2 = s2.replaceFirst(String.valueOf(s2.charAt(s2.indexOf(s1.charAt(i)))), "");
                s1 = s1.replaceFirst(String.valueOf(s1.charAt(i)), "");
                i = 0;
            } else i++;
    return result - s1.length();
    }
}
