package _1322.Test1;

class Main {
    public static void main(String[] args) {
        Furniture chair = new Furniture("Recliner", 100.0);
        Furniture couch = new Furniture("Love Couch", 200.0);
        System.out.println("Furniture name: " + chair.name + "\tPrice:$" + chair.price + "\tis Good?" + chair.getIsGood() + "tIs Affordable? Yes.");
        System.out.println("Furniture name: " + couch.name + "\tPrice:$" + couch.price + "\tis Good?" + couch.getIsGood() + "tIs Affordable? Yes.");
    }
}

