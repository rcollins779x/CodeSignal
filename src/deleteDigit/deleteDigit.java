package deleteDigit;

class deleteDigit {
    static void main(String[] args) {
        int n = 123450;
        System.out.println(deleteDigit(n));
    }
    static int deleteDigit(int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < String.valueOf(n).length(); i++)
            max = Math.max(max, Integer.parseInt(String.valueOf(n).substring(0, i) + String.valueOf(n).substring(i + 1)));
        return max;
    }
}
