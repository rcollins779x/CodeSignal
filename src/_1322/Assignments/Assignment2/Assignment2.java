//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment2;

import java.util.Scanner;

class Assignment2 {
    public static void main(String[] args) {
        int menu, pages, index, noOfDaysOnHold, save, available = 0;
        double length;
        String title, author, genre;

        Scanner scan = new Scanner(System.in);
        Object[] Catalog = new Object[10];

        //Books Default Constructor
        Books book0 = new Books();
        book0.genID(0);
        Catalog[0] = book0;

        //Books(String title, String author, String genre, int pages, boolean checkedIn)
        Books book1 = new Books("Lord of the Rings","Tolkien","fiction",328,true);
        book1.genID(1);
        Catalog[1] = book1;

        //Video Default Constructor
        Video vid0 = new Video();
        vid0.genID(2);
        Catalog[2] = vid0;

        //Video(String title, double length, boolean checkedIn)
        Video vid1 = new Video("Star Wars Episode 1",2.5,true);
        vid1.genID(3);
        Catalog[3] = vid1;

        Video vid2 = new Video("Matrix Revolution",1.75,true);
        vid2.genID(4);
        Catalog[4] = vid2;

        //Testing of Class Methods
        book0.putOnHold("null","null","null", 999,10);
        vid0.putOnHold("null", 6.5,10);
        for (Object loop : Catalog) available = loop == null ? available + 1 : available;

        do {    //Menu
            System.out.println("Select an option:");
            System.out.println("0. Exit");
            System.out.println("1. Display catalog.");
            System.out.println("2. Check out an item.");
            System.out.println("3. Return a book.");
            if (available > 0) {
                System.out.println("4. Enter a new book to the catalog.");
                System.out.println("5. Enter a new video to the catalog.");
            }
            menu = scan.nextInt(); scan.nextLine();

            switch (menu) {
                case 0:
                    return;
                case 1:
                    for (Object obj : Catalog) {
                        if (obj == null) break;
                        System.out.println(obj);
                    }
                    System.out.println("Total shelf space left is " + available);
                    break;
                case 2:
                    System.out.println("0. Go back.");
                    System.out.println("What is the ID you want to checkout?");
                    index = scan.nextInt() % 1000;
                    scan.nextLine();
                    if (index == 0) break;

                    if (index >= Catalog.length - available) {
                        System.out.println("I can't find that id.\nPlease try again.");
                        break;
                    }

                    //check which class the index belongs to
                    if (Catalog[index] instanceof Books) {
                        Books item = (Books) Catalog[index];
                        if (!item.getCheckedIn()) {
                            System.out.println("I'm sorry. There are no available copies. Please try again.");
                            break;
                        }
                    } else {
                        Video item = (Video) Catalog[index];
                        if (!item.getCheckedIn()) {
                            System.out.println("I'm sorry. There are no available copies. Please try again.");
                            break;
                        }
                    }
                    System.out.println(Catalog[index]);

                    System.out.println("0. Go back.");
                    System.out.println("1. How long are you checking this book for?");
                    noOfDaysOnHold = scan.nextInt(); scan.nextLine();
                    if (noOfDaysOnHold == 0) break;

                    if (Catalog[index] instanceof Books) {
                        Books item = (Books) Catalog[index];
                        item.putOnHold(noOfDaysOnHold);
                        System.out.println("No. of Days On Hold: " + item.getMinDaysOnHold());
                    } else
                    {
                        Video item = (Video) Catalog[index];
                        item.putOnHold(noOfDaysOnHold);
                        System.out.println("No. of Days On Hold: " + item.getMinDaysOnHold());
                    }
                break;
              case 3:
                    System.out.println("0. Go back.");
                    System.out.println("What is the book ID you want to return?");
                    index = scan.nextInt() % 1000; scan.nextLine();

                    if(index == 0) break;
                    if(Catalog[index] instanceof Books)
                    {
                        Books item = (Books)Catalog[index];
                        item.putOnHold(0);
                    } else
                    {
                        Video item = (Video)Catalog[index];
                        item.putOnHold(0);
                    }

                    System.out.println("Your book has been checked in.");
                    break;
                case 4:
                    Books book = new Books();
                    //Books(String title, String author, String genre, int pages, boolean checkedIn)
                    System.out.println("Enter book Title:\t\t");
                    title = scan.nextLine();
                    System.out.print("Enter book Author:\t");
                    author = scan.nextLine();
                    System.out.print("Enter book Genre:\t");
                    genre = scan.nextLine();
                    System.out.print("Enter total pages:\t");
                    pages = scan.nextInt(); scan.nextLine();
                    System.out.println("Book automatically assumed to be checked in.");

                    System.out.println("0. Cancel\n1. Save");
                    save = scan.nextInt(); scan.nextLine();
                    if(save == 0) break;

                    book.setTitle(title);
                    book.setAuthor(author);
                    book.setGenre(genre);
                    book.setPages(pages);
                    book.setCheckedIn(true);

                    book.genID(Catalog.length - available);
                    Catalog[Catalog.length - available] = book;

                    available = 0;
                    for (Object loop : Catalog) available = loop == null ? available + 1 : available;

                    break;
                case 5:
                    Video video = new Video();
                    //Video(String title, double length, boolean checkedIn)
                    System.out.println("Enter Title of video:\t\t");
                    title = scan.nextLine();
                    System.out.print("Enter total length:\t");
                    length = scan.nextDouble(); scan.nextLine();
                    System.out.println("Book automatically assumed to be checked in.");

                    System.out.println("0. Cancel\n1. Save");
                    save = scan.nextInt(); scan.nextLine();
                    if(save == 0) break;

                    video.setTitle(title);
                    video.setLength(length);
                    video.setCheckedIn(true);

                    video.genID(Catalog.length - available);
                    Catalog[Catalog.length - available] = video;

                    available = 0;
                    for (Object loop : Catalog) available = loop == null ? available + 1 : available;
                    break;
            }

        } while (true);
    }
}
