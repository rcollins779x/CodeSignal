//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment12;

import java.util.ArrayList;
import java.util.Scanner;

public class MyFileReader {
    public static ArrayList<String> ScanList(Scanner s) {
        ArrayList<String> temp = new ArrayList<>();
        while(s.hasNextLine()) temp.add(s.nextLine());
        return temp;
    }

    public static ArrayList<Object> split(ArrayList<String> words) {
        ArrayList<Object> temp = new ArrayList<>();
        ArrayList<String> part1 = new ArrayList<>();
        ArrayList<String> part2 = new ArrayList<>();
        for (int i = 1; i < words.size()-1; i+=2) {
            part1.add(words.get(i-1));
            part2.add(words.get(i));
        }
        if(words.size()%2!=0) part1.add(words.get(words.size()-1));
        temp.add(part1);
        temp.add(part2);
        return temp;
    }
}
