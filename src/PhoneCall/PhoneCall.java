package PhoneCall;

class PhoneCall {
    static void main(String[] args) {
        int min1 = 3, min2_10 = 1, min11 = 2, s = 20;
        System.out.println(phoneCall(min1,min2_10,min11,s));
    }
    static int phoneCall(int min1, int min2_10, int min11, int s) {
        int total= 0;
        if (s>=min1) {
            s-=min1;
            total++;
            System.out.println("s= " + s + "\ttotal1 = " + total);
        }
        for (int i = 0; i < 9; i++)
            if (s >= min2_10) {
                s -= min2_10;
                total++;
                System.out.println("s= " + s + "\ttotal2-10 = " + total);
            }
        while (s>=min11 && total > 9) {
            s-=min11;
            total++;
            System.out.println("s= " + s + "\ttotal11+ = " + total);
        }
        return total;
    }
}
