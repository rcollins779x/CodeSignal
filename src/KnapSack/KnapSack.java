package KnapSack;

class KnapSack {
    static void main (String[] args) {
        int v1 = 3, w1 = 5, v2 = 3, w2 = 8, maxW= 10;
        System.out.println(knapsackLight(v1,w1,v2,w2,maxW));
    }
    static int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        if(maxW >= weight1 + weight2) return value1 + value2;
        if(maxW < weight1 && maxW < weight2) return 0;
        if(value1 >= value2) if(maxW >= weight1) return value1; else return value2;
        if(maxW >= weight2) return value2; else return value1;
    }
}
