package BinaryCode;

class BinaryCode {
    static void main(String[] args) {
        String code ="010010000110010101101100011011000110111100100001";
        System.out.println(messageFromBinaryCode(code));
    }
    static String messageFromBinaryCode(String code) {
        String temp = "";
        for (int i = 0; i < code.length(); i += 8) temp += (char) Integer.parseInt(code.substring(i, i + 8), 2);
        return temp;
    }

}
