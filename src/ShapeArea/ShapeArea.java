package ShapeArea;

class ShapeArea {
    static void main(String[] args) {
        int total = 1;
        for(int n = 5; n > 1; n--)
            total += (n - 1) * 4;
        System.out.println(total);
    }
}
