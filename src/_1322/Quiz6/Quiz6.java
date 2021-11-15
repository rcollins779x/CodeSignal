package _1322.Quiz6;

class Quiz6 {
    public static void main (String[] args) {
        String s = "hello";
        int n = 5, N = 0;
        System.out.println(repeatNTimes(s,n));
        System.out.println(repeatNTimes("Good morning!",3));
        //fxyz(1) = 1
        //fxyz(N) = fxyz( (N + 1)/2 ) + fxyz(N / 2)
        //, for N >1
        for (int i = 1; i < 10; i++) {
            System.out.println(xyz(i));
        }
        System.out.println(xyz(8));

    }
    private static int xyz(int N) {
        if (N ==1) {
            return 1;
        } else return xyz( (N+1)/2) + xyz(N/2);
    }
    private static int fxyz(int N) {
        if (N ==1) {
            return 1;
        } else return fxyz( (N+1)/2) + fxyz(N/2);
    }
    private static int myFunc(int N) {
        if (N ==1) {
            return 1;
        } else return myFunc( (N+1)/2) + myFunc(N/2);
    }
    private static String repeatNTimes(String s, int n) {
        return ((n == 1) ? s : s + repeatNTimes(s, n-1));
    }
}
