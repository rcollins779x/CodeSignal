package PalindromeSort;

class PalindromeSort {
    static void main (String[] args) {
    String inputString = "abbcabb";
    palindromeRearranging(inputString);
        String someString = "elephant";
        long count = someString.chars().filter(ch -> ch == 'e').count();
        System.out.println(count);

        long count2 = someString.codePoints().filter(ch -> ch == 'e').count();
        System.out.println(count2);
    }
    static boolean palindromeRearranging(String inputString) {
        String temp= inputString;
        int length = temp.length();


        System.out.println(temp);
        return false;
    }

}
