//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment13;

class Movies {
    public static void main(String[] args) {
        BluRayCollection ll = new BluRayCollection() {{                        //Creation of LinkedList Collection
            add(new BluRayDisc("The 2nd Brian","Skiba",2020,24.95));
            add(new BluRayDisc("Bloodshot", "David S F Wilson", 2020,19.95));
            add(new BluRayDisc("The Outpost", "Rod Lurie", 2019,15.95));
            add(new BluRayDisc("Time to Hunt", "Yoon Sung-Hyun", 2020,17.50));
            add(new BluRayDisc("Invasion", "Fyodor Sergeyevich Bondarchuk",2020,19.95));
        }};

        System.out.println(ll);                                           //Printing out the Collection

        for (int i = 0;i < 5; i++) {
            String title = i % 2 == 0 ? "Bloodshot" : "Jaws";         //Searching for a Title
            System.out.println(i<2 ? "DVD " + title + ((ll.search(title).getTitle()==null) ? " Not found" : " found: " + ll.search(title)) :
                    (ll.remove(title) ? "Delete of " + title + " successful." : "Unable to delete " + title) + ll);
        }
    }
}
