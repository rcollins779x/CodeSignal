package _1322.Assignments.Assignment2;

import java.time.LocalDate;

class Books {
    private String title;
    private String author;
    private String genre;
    private int pages;
    private int id;
    private int minDaysOnHold;
    boolean checkedIn;

    Books() {   //Default Constructor
        id = 0;
        title = "null";
        checkedIn = true;
        author = "null";
        genre = "null";
        pages = 0;
        minDaysOnHold = 0;
    }

    Books(String title, String author, String genre, int pages, boolean checkedIn) {   //Overloaded Constructor
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
        this.checkedIn = checkedIn;
        minDaysOnHold = 0;
    }

    int getID() {
        //ID is book id user wants to check out. I need to return the index of the book
        return id;
    }

    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
    String getGenre() {
        return genre;
    }
    int getMinDaysOnHold() {
        return minDaysOnHold;
    }
    int getPages() {
        return pages;
    }
    boolean getCheckedIn() {
        return checkedIn;
    }
    void genID(int index) {
        setID(getTitle().charAt(0) * 10000 + index);

        if ("fiction".equals(getGenre().toLowerCase()))
            setID(getID() + 70000000);
        else
            setID(getID() + 10000000);
    }

    void setID(int id) {
        this.id = id;
    }
    void setTitle(String title) {
        this.title = title;
    }
    void setAuthor(String author) {
        this.author = author;
    }
    void setGenre(String genre) {
        this.genre = genre;
    }
    void setPages(int pages) {
        this.pages = pages;
    }
    void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    void putOnHold(int minDaysOnHold) {
        setCheckedIn(minDaysOnHold == 0);
        this.minDaysOnHold = minDaysOnHold;
    }


    void putOnHold(String author, String genre, String title, int pages, int minDaysOnHold) {
        setCheckedIn(minDaysOnHold == 0);
        this.minDaysOnHold = minDaysOnHold;
    }

    static int getIndex(int id) {
        return id % 1000;
    }

    //toString override
    @Override
    public String toString() {
        LocalDate date = LocalDate.now();
        LocalDate dueDate = date.plusDays(getMinDaysOnHold());
        String temp2;
        String temp1 =  "ID:\t\t\t" + getID() + "\n" +
                        "Title:\t\t" + getTitle() + "\n";
        if(getCheckedIn())
            temp2 =     "Checked in:\t" + getCheckedIn() + "\n";
        else
           temp2 =      "Checked out until \t" + dueDate + "\n" +
                        "No. of Days on hold: " + getMinDaysOnHold() + "\n";
        String temp3 =  "Author:\t\t" + getAuthor() + "\n" +
                        "Genre:\t\t" + getGenre() + "\n" +
                        "Pages:\t\t" + getPages() + "\n";
        return temp1 + temp2 + temp3;
    }

}
