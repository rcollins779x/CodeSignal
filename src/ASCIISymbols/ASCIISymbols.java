package ASCIISymbols;

class ASCIISymbols {
    static void main(String[] args) {
        for(int i = 0; i < 9600; i++) {

            System.out.print((char) i + " ");
            if(i%60 == 0) System.out.println(i);
        }
        System.out.println("\n" + (char) 9474 + (char) 9492 + (char) 9500);
    }
}
