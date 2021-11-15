package longestDigitsPrefix;

class longestDigitsPrefix {
    static void main (String[] args) {
        String inputString = "123aa1";
        System.out.println(longestDigitsPrefix(inputString));
    }
    static String longestDigitsPrefix(String inputString) {
        String[] section = inputString.replaceAll("[^0-9]","_").split("_");
        if(section.length == 0 || section[0].equals("_")) return ""; else return section[0];
    }
}
