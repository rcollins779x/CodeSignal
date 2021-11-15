package NestedLogic;

import java.util.Scanner;

class NestedLogic {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int retDay = scan.nextInt();
        int retMon = scan.nextInt();
        int retYr = scan.nextInt();
        int dueDay = scan.nextInt();
        int dueMon = scan.nextInt();
        int dueYr = scan.nextInt();
        int fine;
        if(retYr < dueYr) fine = 0;
        else if(retYr > dueYr) fine = 10000;
        else if(retMon < dueMon) fine = 0;
        else if(retMon > dueMon) fine = 500 * (retMon - dueMon);
        else if(retDay <= dueDay) fine = 0;
        else fine = 15 * (retDay - dueDay);
        System.out.println(fine);


    }
}
