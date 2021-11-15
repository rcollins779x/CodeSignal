package isDigit;

class isDigit {
    static void main (String[] args) {
        char symbol = '0';
        System.out.println(isDigit(symbol));
    }
    static boolean isDigit(char symbol) {
        return String.valueOf(symbol).matches("\\d");
    }
}
