package _1322.Assignments.Assignment4;

class Rectangle extends Shape{

    Rectangle () {
        this(0,0);
    }

    Rectangle(double side1, double side2) {
        super(side1,side2);
    }

    @Override
    double calculateArea () {
        return getSide1() * getSide2();
    }

    @Override
    double calculatePerimeter () {
        return (getSide1() + getSide2()) * 2;
    }

    @Override
    public String toString() {
        return String.format("| Rectangle: %5s = %6.1f | %4s = %6.1f | %4s   %6s | %4s = %6.1f | %4s = %6.1f | ",
                "Width",getSide1(),"Height",getSide2(),"","","Perimeter",calculatePerimeter(),"Area", calculateArea());
    }
}
