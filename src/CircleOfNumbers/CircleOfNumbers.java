package CircleOfNumbers;

class CircleOfNumbers {
    static void main(String[] args) {
        int n = 10;
        int firstNumber = 5;
        System.out.println(circleOfNumbers(n,firstNumber));
    }
    static int circleOfNumbers(int n, int firstNumber) {
        return (n/2 + firstNumber) % n;
    }
}
