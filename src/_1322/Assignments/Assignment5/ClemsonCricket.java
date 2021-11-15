//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment5;

class ClemsonCricket extends Cricket {

    ClemsonCricket() {
        super();
    }
    @Override
    int getChirpCount(Environment env) {
        return Math.round((float)super.getChirpCount(env) * 8 / 10);
    }
    @Override
    public String toString() {
        return "Cricket{}";
    }
}
