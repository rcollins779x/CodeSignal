package LargestNumber;

class LargestNumber {
    static void main(String[] args) {
        int n = 6;
        System.out.println(largestNumber(n));
    }
    static int largestNumber(int n) {
        String i;
        for (i = ""; i.length() < n;) i += "9";
        return Integer.parseInt(i);
    }
}
