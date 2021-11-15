//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment5;

class Cricket {

    Cricket() {

    }

    int getChirpCount(Environment env) {
        return 4 * (env.getTemp() - 10);
    }
    @Override
    public String toString() {
        return "Cricket{}";
    }
}
