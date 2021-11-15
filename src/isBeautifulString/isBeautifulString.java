package isBeautifulString;

import java.util.Arrays;

class isBeautifulString {
    static void main(String[] args) {
        String inputString = "zaa";
        System.out.println(isBeautifulString(inputString));
    }
    static boolean isBeautifulString(String inputString) {
        char[] temp = inputString.toCharArray();
        Arrays.sort(temp);
        int max = 0, sum = 0, counter = 0;
        int value = 97;
        for (int j = 0; j < inputString.chars().distinct().count();j++) {
            for (int i = sum; i < temp.length; i++) if( temp[i] == value) counter++;
            if (counter == 0) return false;
            if(value == 97 || counter <= max) max = counter; else return false;
            value++;
            sum += counter;
            counter = 0;
        }
        return true;
    }
}
