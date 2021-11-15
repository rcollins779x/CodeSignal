package isIPv4Address;

class isIPv4Address {
    static void main(String[] args) {
        String inputString = "64.233.161.00";
        System.out.println(isIPv4Address(inputString));
    }
    static boolean isIPv4Address(String inputString) {
        String[] array = inputString.split("\\.");
        System.out.println(array.length);
        try {
            for (String s : array) {
                if(s.length()>1 && s.charAt(0) == '0') return false;
                if (Integer.parseInt(s) < 0 || Integer.parseInt(s) > 255) return false;
            }
        } catch(Exception e){
            return false;
        }
        return array.length == 4;
    }

}
