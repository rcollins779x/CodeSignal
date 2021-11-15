package AlphaShift;

class AlphabeticShift {
    static void main (String[] args) {
        String inputString = "bqzYx";
        System.out.println(alphabeticShift(inputString));
    }
    static String alphabeticShift(String inputString) {
        StringBuilder temp = new StringBuilder();
        System.out.println(temp);
        for (int i = 0; i < inputString.length(); i++) temp.append((char) (((int) inputString.charAt(i) >= 122) ?
                (int) inputString.charAt(i) - 25 : (int) inputString.charAt(i) + 1));
        return String.valueOf(temp);
    }
}
