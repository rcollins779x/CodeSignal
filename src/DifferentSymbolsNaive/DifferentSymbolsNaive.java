package DifferentSymbolsNaive;

class DifferentSymbolsNaive {
    static void main (String[] args) {
        String s= "abcdcba";
        System.out.println(differentSymbolsNaive(s));
    }
    static int differentSymbolsNaive(String s) {
        int len = 0;
        while (s.length()>0){
            s = s.replaceAll(String.valueOf(s.charAt(0)), "");
            len++;
        }
        return len;
    }

}
