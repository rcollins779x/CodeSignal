package AreSimilar;

class AreSimilar {
    static void main (String[] args) {
        int[] a = {1, 1, 4};
        int[] b = {1, 2, 3};
        System.out.println(areSimilar(a,b));
    }
    static boolean areSimilar(int[] a, int[] b) {
        int counter = 0, c=0, d=0;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) {
                if(counter == 0) {
                    c = a[i]; d = b[i];
                } else if (c != b[i] || d != a[i]) return false;
            counter++;
        }
        return (counter < 3);
    }
}
