package FileNaming;

import java.util.*;

class FileNaming {
    static void main(String[] args) {
        String[] names = {"dd", "dd(1)", "dd(2)", "dd", "dd(1)", "dd(1)(2)", "dd(1)(1)", "dd", "dd(1)"};
        //expected return "dd", "dd(1)", "dd(2)","dd(3)","dd(1)(1)","dd(1)(2)","dd(1)(1)(1)","dd(4)","dd(1)(3)"
        System.out.println(Arrays.toString(fileNaming(names)));
    }

    static String[] fileNaming(String[] original) {
        HashSet<String> temp = new HashSet<>();
        for (int i = 0, count = 0; i < original.length; i++, count = 0) {
            temp.add(original[i]);                                                    //Check if file name is unique
            while (temp.size() != (i+1)) temp.add(original[i] + "(" + ++count + ")"); //Searches for unique name
            if( count != 0) original[i] += "("+count+")";                             //If needed Add unique modifier
        }
        return original;
    }
}