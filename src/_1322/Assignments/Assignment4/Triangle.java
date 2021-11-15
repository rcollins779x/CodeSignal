package _1322.Assignments.Assignment4;

class Triangle extends Shape{
    private double side3;
    private double perimeter;

    Triangle() {
        super(0,0);
        side3 = 0;
    }

    Triangle(double side1, double side2, double side3) {
        super(side1,side2);
        this.side3 = side3;
    }

    @Override
    double calculateArea () {
        double s = perimeter/2;
        return Math.sqrt(s * (s - getSide1()) * (s - getSide2()) * (s - side3));
    }

    @Override
    double calculatePerimeter () {
        perimeter = getSide1() + getSide2() + side3;
        return perimeter;
    }

    @Override
    public String toString() {
        return String.format("| Triangle : %5s = %6.1f | %4s  = %6.1f | %4s = %5.1f | %4s = %6.1f | %4s = %6.1f | ",
                "Side1",getSide1(),"Side2",getSide2(),"Side3",side3,"Perimeter",calculatePerimeter(),"Area", calculateArea());
    }
}
