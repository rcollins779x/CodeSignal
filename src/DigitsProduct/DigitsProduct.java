package DigitsProduct;

class DigitsProduct {
    static void main(String[] args) {
        int product = 1;
        System.out.println(digitsProduct(product));
    }
    static int digitsProduct(int product) {
        String temp = "-1";
        if(product == 0 || product == 1) return 10 - 9 * product;
        for (int i = 9; i > 1; i--)
            while ((product % i) == 0) {
                product /= i;
                temp = i + temp.replaceAll("-1","");
            }
        return Integer.parseInt(temp);
    }
}
