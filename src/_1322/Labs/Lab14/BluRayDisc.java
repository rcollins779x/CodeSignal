//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab14;

class BluRayDisc {
    private final String title, director;
    private final int yearOfRelease;
    private final double cost;

    BluRayDisc() {
        title = director = null;
        yearOfRelease = (int) (cost = 0);
    }

    BluRayDisc(String title, String director, int yearOfRelease, double cost) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.cost = cost;
    }

    double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("$%.2f %d %-15s", cost, yearOfRelease, title) + director;
    }
}