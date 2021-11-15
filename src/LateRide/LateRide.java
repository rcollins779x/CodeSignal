package LateRide;

class LateRide {
    static void main(String[] args) {
        int n = 808;
        System.out.println(lateRide(n));
    }
    static int lateRide(int n) {
        int sum = 0;
        for (int temp = (n/60*100 + n%60)*10;temp > 0;) sum += (temp /= 10) % 10;
        return sum;
    }
}
