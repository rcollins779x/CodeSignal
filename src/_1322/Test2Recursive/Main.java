package _1322.Test2Recursive;

class Main {
    public static void main (String[] args) {
        PrintBy5(10,100);
        //System.out.println(1! != 0!);
    }
    static int PrintBy5(int start, int end) {
        System.out.println(start);
        if(start >= end) return 0;
        return PrintBy5(start+5,end);

    }
    void movement(int start, int end) { System.out.println(start); }

    void movement() {System.out.println("Standing Still"); }




}
