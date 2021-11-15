//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment4;

import java.util.*;

class Sample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Shape> hallway = new ArrayList<>();
        Set<Integer> values = new HashSet<>(Arrays.asList(7,12,21,25,33,36,41,49,54,63,72,88,91,99));

        //Bulb creation and initialization
        for ( int i = 0; i < 100; i++)
            hallway.add(new Shape());

        System.out.println("Number of students: ");
        int max = scan.nextInt(); scan.nextLine();

        //Traverses through all bulbs
        for ( int bulb = 1; bulb <= max; bulb++)
            //Iterates through each student pulling or not pulling the string
            for(int students = 1; students <= max; students++)
                if(bulb * students < hallway.size())
                    hallway.get(bulb * students);

        for (Shape bulb : hallway)
            //Prints state of specific bulbs
            if (values.contains(hallway.indexOf(bulb)))
                System.out.println("Bulb " + hallway.indexOf(bulb) + " is On.");
        scan.close();
    }
}