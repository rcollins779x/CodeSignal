package _1322.Assignments.Assignment2;

import java.time.LocalDate;

class Video {
    private String title;
    private double length;
    private int id;
    private int minDaysOnHold;
    boolean checkedIn;

    Video() {   //Default Constructor
        id = 0;
        title = "null";
        checkedIn = true;
        length = 1;
        minDaysOnHold = 1;
    }

    Video(String title, double length, boolean checkedIn) {   //Overloaded Constructor
        this.title = title;
        this.length = length;
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
    int getMinDaysOnHold() {
        return minDaysOnHold;
    }
    double getLength() {
        return length;
    }
    boolean getCheckedIn() {
        return checkedIn;
    }
    void genID(int index) {
        setID(getTitle().charAt(0) * 10000 + index);
        setID(getID() + 50000000);
    }

    void setID(int id) {
        this.id = id;
    }
    void setTitle(String title) {
        this.title = title;
    }
    void setLength(double length) {
        this.length = length;
    }
    void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    void putOnHold(int minDaysOnHold) {
        setCheckedIn(minDaysOnHold == 0);
        this.minDaysOnHold = minDaysOnHold;
    }

    void putOnHold(String title, double length, int minDaysOnHold) {
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

        //String dueDate = DateFormat.getInstance().format(date);
        String temp2;
        String temp1 =  "ID:\t\t\t" + getID() + "\n" +
                        "Title:\t\t" + getTitle() + "\n";
        if(getCheckedIn())
            temp2 =     "Checked in:\t" + getCheckedIn() + "\n";
        else
            temp2 =      "Checked out until " + dueDate + "\n" +
                         "No. of Days on hold: " + getMinDaysOnHold() + "\n";
        String temp3 =   "Length:\t\t" + getLength() + " hours\n";
        return temp1 + temp2 + temp3;
    }

}
