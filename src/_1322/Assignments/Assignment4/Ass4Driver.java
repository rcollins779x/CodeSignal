package _1322.Assignments.Assignment4;

import java.util.*;

class Ass4Driver {
    public static void main(String[] args) {
        int menu;

        Scanner scan = new Scanner(System.in);
        ArrayList<Shape> list = new ArrayList<>();

        //Pointless code to ensure all methods work properly
        Shape shape = new Shape(0,0);
        shape.setSide1(0);
        shape.setSide2(0);
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        list.add(shape);
        System.out.println(list.get(0));
        list.remove(0);
        list.add(rectangle);
        list.remove(0);
        list.add(triangle);
        list.remove(0);

        do {
            System.out.println("0. Exit");
            System.out.println("1. Add a Rectangle");
            System.out.println("2. Add a Triangle");
            System.out.println("3. Display All Shapes with Details");
            System.out.print("Please choose an option: ");
            menu = scan.nextInt(); scan.nextLine();

            switch(menu) {
                case 1 : {
                    System.out.print("Enter 1st side of rectangle:\t");
                    double side1 = scan.nextInt(); scan.nextLine();

                    System.out.print("Enter 2nd side of rectangle:\t");
                    double side2 = scan.nextInt(); scan.nextLine();

                    Shape newRectangle = new Rectangle(side1, side2);
                    list.add(newRectangle);
                    System.out.println("Done creating the rectangle:\t");
                }
                case 2 : {
                    double side1, side2, side3, max;
                    do {
                        System.out.print("Enter 1st side of triangle:\t");
                        side1 = scan.nextInt(); scan.nextLine();

                        System.out.print("Enter 2nd side of triangle:\t");
                        side2 = scan.nextInt(); scan.nextLine();

                        if (side1 == side2) side3 = side1;
                        else {
                            System.out.print("Enter 3rd side of triangle:\t");
                            side3 = scan.nextInt(); scan.nextLine();
                        }
                        max = Math.max(Math.max(side1, side2), side3);

                        if (side1 + side2 + side3 - max <= max)
                            System.out.println("You entered an invalid triangle. Please try again.");
                    } while (side1 + side2 + side3 - max <= max);

                    list.add(new Triangle(side1, side2, side3));
                    System.out.println("Done creating the triangle:\t");
                }
                case 3 : {
                    for (Shape all : list)
                        System.out.println(all);
                }
            }
        } while (menu != 0);
    }
}
