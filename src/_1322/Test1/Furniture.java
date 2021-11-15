package _1322.Test1;

class Furniture {
    String name;
    double price;
    private boolean isGood;

    Furniture() { //Default Constructor
        isGood = false;
    }
    Furniture(String name, double price) {} //Overloaded Constructor
    boolean getIsGood() {
        return isGood;
    }
    void setIsGood(boolean isGood) {
        this.isGood = isGood;
    }
    double isAffordible() {
        return 0;
    }

    @Override
    public String toString() {
        return "Furniture name: " + name + "\tPrice: $" + price + "\tisGood? " + getIsGood() + "\tIs Affordible? Yes.";
    }
}
