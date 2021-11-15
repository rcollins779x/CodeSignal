//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab10;

class Lab10b {
    public static void main (String[] args) {
        String s1 = "Computer", s2 = "retupmCo";
        System.out.println(isReverse(s1,s2));
        System.out.println(isReverse("Hello","olleh"));
        System.out.println(isReverse("",""));
    }

    static boolean isReverse(String s1, String s2) {
        if(s1.length() == 0 && s2.length() == 0) return true;
        if(s1.length()!=s2.length() || s1.toLowerCase().charAt(0) != s2.toLowerCase().charAt(s2.length()-1)) return false;
        return isReverse(s1.substring(1), s2.substring(0, s2.length()-1));
    }
}

