package RussianDolls;

import java.util.ArrayList;
import java.util.Collections;

class RussianDolls {
    static void main(String[] args) {
        ArrayList<Integer> dolls = new ArrayList<>();
        dolls.add(0);
        dolls.add(2);
        dolls.add(2);
        dolls.add(3);
        dolls.add(0);
        dolls.add(1);
        dolls.add(2);
        dolls.add(3);
        System.out.println(dolls);
        int counter = 0;
        //boolean remove = true;
        int size = 0;
        for (int j = 0;size < dolls.size();j = 0) {
            size = dolls.size();
            //remove = false;
            for (int i = 1; i < dolls.size(); i++)
                if (dolls.get(j) < dolls.get(i)) {
                    dolls.remove(j);
                    j = --i;
                    //remove = true;
                }

            if(size < dolls.size()) {
                dolls.remove(j);
                counter++;
            }
        System.out.println(dolls);
        }
        System.out.println("Count: " + counter);
    }
}
