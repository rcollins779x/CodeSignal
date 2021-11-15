//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment5;

class Environment {
    private int temp;

    Environment() {
        temp = 0;
    }
    Environment(int temp) {
        this.temp = 0;
        this.temp = temp;
    }

    int getTemp() {
        return temp;
    }

    void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Environment{}";
    }
}
