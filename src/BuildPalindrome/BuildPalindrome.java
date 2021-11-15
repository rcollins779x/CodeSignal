package BuildPalindrome;

class BuildPalindrome {
    static void main(String[] args) {
        String st = "kebab";
        System.out.println(buildPalindrome(st));
    }
    static String buildPalindrome(String st) {
        int len = st.length()-1, mid1, mid2;
        mid2 = len % 2 + (mid1 = len / 2);
        while (mid2 <= len) if (st.charAt(mid1) == st.charAt(mid2)) { mid1--; mid2++; } else mid1++;
        while (mid1 >= 0) st += st.charAt(mid1--);
        return st;
    }
}
