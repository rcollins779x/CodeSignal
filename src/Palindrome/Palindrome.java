package Palindrome;

class Palindrome {

    static void main (String[] args) {
        String input = "aba";
        System.out.print(checkPalindrome(input));
    }
    static boolean checkPalindrome(String st) {
        for (int i = 0, j = st.length()-1; i < st.length(); i++,j--) if (st.charAt(i) != st.charAt(j)) return false;
        return true;
    }
}
