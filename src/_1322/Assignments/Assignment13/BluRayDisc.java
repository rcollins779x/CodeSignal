//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment13;

class BluRayDisc {
    private final String title, director;
    private final int yearOfRelease;
    private final double cost;

    BluRayDisc() {
        title = director = null;
        yearOfRelease = 0;
        cost = 0;
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
    String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return String.format("$%.2f %d %-15s", cost, yearOfRelease, title) + director;
    }
}