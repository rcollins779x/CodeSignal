//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab14;

class Movies {
    public static void main(String[] args) {
        BluRayCollection ll = new BluRayCollection() {{                      //Creation of LinkedList Collection
            add(new BluRayDisc("The 2nd Brian","Skiba",2020,24.95));
            add(new BluRayDisc("Bloodshot", "David S F Wilson", 2020,19.95));
            add(new BluRayDisc("The Outpost", "Rod Lurie", 2019,15.95));
            add(new BluRayDisc("Time to Hunt", "Yoon Sung-Hyun", 2020,17.50));
            add(new BluRayDisc("Invasion", "Fyodor Sergeyevich Bondarchuk",2020,19.95));
        }};
        System.out.println(ll);                                           //Printing out the Collection
    }
}
