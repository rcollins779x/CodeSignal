package EvenDigitsOnly;

class EvenDigitsOnly {
    static void main (String[] args) {
        int test = 248622;
        System.out.println(evenDigitsOnly(test));
    }
    static boolean evenDigitsOnly(int n) {
        String temp = String.valueOf(n);
        boolean check;
        for (int i = 0; i < temp.length(); i++) {
            check = (temp.charAt(i)%2 == 0);
            if (!check) return false;
        }
        return true;
    }
}
