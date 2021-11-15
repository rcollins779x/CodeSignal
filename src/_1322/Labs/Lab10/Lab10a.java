//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab10;

class Lab10a {
    public static void main (String[] args) {
        String s = "hello";
        int n = 5;
        System.out.println(repeatNTimes(s,n));
        System.out.println(repeatNTimes("Good morning!",3));
    }

    private static String repeatNTimes(String s, int n) {
        return ((n == 1) ? s : s + repeatNTimes(s, n - 1));
    }
}
