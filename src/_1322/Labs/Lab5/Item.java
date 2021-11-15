//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab5;

abstract class Item {
    private final String title;

    Item() {
        this.title = null;
    }

    Item(String title) {
        this.title = title;
    }

    abstract String getListing();

    String getTitle()
    {
        return title;
    }

    public String toString() { return "";}
}
