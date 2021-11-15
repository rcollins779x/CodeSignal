//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab5;

import java.util.Scanner;

class myCollection {
    public static void main(String[] args) {
        char type;
        Scanner scan = new Scanner(System.in);
        Item[] items = new Item[5];
        Item item;
        String bName, aName, isbn;
        int num;

        item = new Book();
        item.getListing();
        item = new Periodicals();
        item.getListing();

        for (int i = 0; i < items.length; i++) {
            do {                    //Checks if input is either b or B or p or P
                System.out.println("Please enter B for book and P for Periodical");
                String input = scan.nextLine();

                type = (input.length()>0) ? input.charAt(0) : 0;

            } while (type != 66 && type != 80 && type != 98 && type != 112);

            if ((type/2)%2 != 0) { //If char is b or B then
                System.out.println("Please enter name of Book");
                bName = scan.nextLine();

                System.out.println("Please enter name of Author");
                aName = scan.nextLine();

                System.out.println("Please enter the ISBN");
                isbn = scan.nextLine();

                item = new Book(bName, aName, isbn);
            } else {                //If char is p or P then
                System.out.println("Please enter name of Periodical");
                bName = scan.nextLine();

                System.out.println("Please enter the issue #");
                num = scan.nextInt(); scan.nextLine();

                item = new Periodicals(bName, num);
            }
            items[i] = item;
        }
        for (Item object : items) {
            object.getListing();
            System.out.println(object);
        }
        scan.close();
    }
}