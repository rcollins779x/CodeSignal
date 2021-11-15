package FileNaming;

import java.util.*;

class LastWorking {
    static void main(String[] args) {
        String[] names = {"dd", "dd(1)", "dd(2)",  "dd",  "dd(1)",  "dd(1)(2)",  "dd(1)(1)",  "dd",  "dd(1)"};
        //expected return "dd", "dd(1)", "dd(2)","dd(3)","dd(1)(1)","dd(1)(2)","dd(1)(1)(1)","dd(4)","dd(1)(3)"
        System.out.println(Arrays.toString(fileNaming(names)));
    }
    static String[] fileNaming(String[] original) {
        for (int cur = 0, tar = 1+cur;tar < original.length;cur++)
            if (original[cur].equals(original[tar])) {                                  // If name is a duplicate ...
                if (cur != tar) original[tar] += "(1)";     //verifies that duplicate is not the target and appends (1)
                tar++;
                cur = -1;
            }
        //this code locates the num between the parenthesis and increments until this cell is unique
        //ideally this should happen immediately after adding "(1)"
        for (int cur = 0, tar = 1+cur;tar < original.length;cur++) {
            if (original[cur].equals(original[tar])) {                                  // If name is a duplicate ...
                if (cur != tar) {                                                       //verifies that duplicate is not the target
                    int num = 1 + Integer.parseInt(original[tar].replaceAll(".*\\(([\\d]+)\\)", "$1"));
                    original[tar] = original[tar].replaceAll("(.*\\()[\\d]+\\)", "$1"+num+")");
                    tar--;
                }
                tar++;
                cur = -1;
            }
        }
        return original;
    }
}