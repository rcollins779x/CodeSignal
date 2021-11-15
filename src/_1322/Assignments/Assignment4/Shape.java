package _1322.Assignments.Assignment4;

class Shape {
    private double side1, side2;

    Shape () {
        this(0,0);
    }

    Shape (double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    double calculateArea () {
        return side1 * side2;
    }

    double calculatePerimeter () {
        return 2 * (side1 + side2);
    }

    double getSide1() {
        return side1;
    }
    double getSide2() {
        return side2;
    }

    void setSide1(double side1) {
        this.side1 = side1;
    }
    void setSide2(double side1) {
        this.side2 = side1;
    }

    @Override
    public String toString() {
        return "";
    }
}
