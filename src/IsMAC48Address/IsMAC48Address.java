package IsMAC48Address;

class IsMAC48Address {
    static void main(String[] args) {
        String inputString = "00-1b-63-84-45-E6";
        System.out.println(isMAC48Address(inputString));
    }
    static boolean isMAC48Address(String inputString) {
        return inputString.matches("(?i:[0-9a-f]{2}(-[0-9a-f]{2}){5})");
    }
}
