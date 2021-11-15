//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab14;

class BluRayCollection {
    private Node first, last, cur;

    BluRayCollection() {
        first = last = null;
    }                         //Default Constructor

    void add(BluRayDisc disc) {//addEnd                                //Adds disc to end of the LL Collection
        Node newDiscNode = new Node();
        newDiscNode.disc = disc;                                              //Is it the first item?
        if (first == null) first = last = newDiscNode;                        //Sets first and last to disc
        else last = ((last.next = newDiscNode).prev = last).next;             //Updates disc pointers to/from lastNode
    }

    @Override
    public String toString() {
        StringBuilder data = new StringBuilder("\nBluRayDisc List:\n");
        int count = 0;
        double totalCost = 0;
        for (cur = first; cur != null; cur = cur.next, count++) {             //Iterates through LL collecting info
            totalCost += cur.disc.getCost();
            data.append(cur.disc).append("\n");
        }
        return String.format("%nMy BlueRay Collection%nNumber of BlueRayDiscs: %d %nTotal Cost: $%.2f " +
                "%nAverage Cost: $%.2f", count, totalCost, totalCost / count) + data;
    }
}