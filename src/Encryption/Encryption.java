package Encryption;

import java.util.ArrayList;

 class Encryption {
    static void main(String[] args) {
        String s1 = "super", s2 = "tower";
        System.out.println(s1.length() + "\t" + s2.length());
        String temp = "";
        for (int j = 0; j < 5; j ++)
            temp = new StringBuilder().append(temp).append(s1.charAt(j)).append(s2.charAt(j)).toString();
        System.out.println(temp);
        System.out.println(mergeStrings(s1,s2));
    }
    static String mergeStrings(String s1, String s2) {
        ArrayList<Integer> freq1 = new ArrayList<>();
        ArrayList<Integer> freq2 = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < 5; i ++)
        {
            for (int j = 0; j < 5; j ++)
                if(s1.charAt(i) == s1.charAt(j)) counter++;
            freq1.add(counter);
            counter = 0;
            System.out.println(freq1.get(i));
        }
        for (int i = 0; i < 5; i ++)
        {
            for (int j = 0; j < 5; j ++)
                if(s2.charAt(i) == s2.charAt(j)) counter++;
            freq2.add(counter);
            counter = 0;
            System.out.println(freq2.get(i));
        }
        StringBuilder temp = new StringBuilder();
        for (int j = 0; j < 5; j ++)
            temp.append(s1.charAt(j)).append(s2.charAt(j));

        return temp.toString();
    }
}
