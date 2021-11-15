package _1322.Test4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class test4 extends Domestic {
    public static void main(String[] args) {
        int x = 71;
        int[] y = {17};
        int z = DoIt(x, y);
        System.out.println("line 1 " + (++x) + " " + (y[0]++) + " " + (--z)); // PRINTLINE 1

        //question 6
        Cat cat = new Cat("tabby", true, "kittenFood");
        cat.animalDetail();
        Domestic d1 = new Domestic("Domestic1", true);

        System.out.println((d1.name));
        System.out.println(d1.isDomestic);
        System.out.println(d1.ifDomestic());
        System.out.println();

        Domestic d2 = new Domestic("Domestic2", false);
        System.out.println(d2.name);
        System.out.println(d2.isDomestic);
        System.out.println(d2.ifDomestic());

        //question 7
        ///* A) */ Animal a1 = new Animal();
        /* B) */ Animal a2 = new Cat();
        ///* C) */ Animal a1 = new Dog();
        ///* D) */ Cat c1 = new Animal();
        /* E) */ Cat c2 = new Cat();
        ///* F) */ Cat c3 = new Dog();
        ///* G) */ Dog d1 = new Animal();
        ///* H) */ Dog d2 = new Cat();
        /* I) */ Dog d3 = new Dog();
        ///* J) */ Object o1 = new Animal();
        /* K) */ Object o2 = new Cat();
        ///* L) */ Object o2 = new Dog();

        //question 8
        try {
            File file = new File("c:/myFile.txt");;
            while (!file.canRead()) {
                Scanner s = new Scanner(System.in);
                System.out.println("File not found. Enter file name.");
                file = new File(s.nextLine());
            }
            Scanner s = new Scanner(file);
            while(s.hasNextLine()) System.out.println(s.nextLine());
            s.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.print("");//finally block not needed since Scanner s was closed in the try block
        }

//        question 9 bad question.
//        likely answer 106,104,102,105,103,101 if you put all of queue into stack first
//        if you put 1st in Q in S then remove from S back to Q before 2nd then answer
//        101,103,105,102,104,106. Its not stated that all must be placed in the stack before removing from it
//
//        question 10
//        Pre order 106,17,11,1,13,67,55,91,305,219,159,259,307,339,359
//        Post order 1,13,11,55,91,67,17,159,259,219,339,359,307,305,106
//
//        extra credit true
        System.out.println((12%5 == 2%5));
    }
    static int DoIt(int a, int[] b)
    {
        a += 18;
        b[0] -= 17;
        System.out.println("line 2 " + (a++) + " " + (++b[0])); // PRINTLINE 2
        return (a + b[0]);
    }
}
/*
a = 71 + 18 = 89
y = b = 17 - 17 = 0 + 1 = 1

print 89 1\n line2

a = 89 + 1 = 90
return 90 + 1 = 91
z = 91
x = 71 + 1 = 72
z = 91 - 1 = 90

//print 72 1 901

y = 1 + 1 = 2
*/
//print 89 1
//print 72 1 89