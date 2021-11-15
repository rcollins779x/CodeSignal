//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment3;

class Lightbulb {
    private boolean bulbState;

    Lightbulb() {                    //Default Constructor
        this.bulbState = false;
    }
    Lightbulb(boolean state) {       //Overloaded Constructor
        this.bulbState = state;
    }
    void pullString() {              //Toggles bulbState
        bulbState = !bulbState;
    }
    boolean isOnOrOff()    {         //Returns bulbState
        return bulbState;
    }
    @Override                               //toString Override
    public String toString() {
        return "\b\b";
    }
}