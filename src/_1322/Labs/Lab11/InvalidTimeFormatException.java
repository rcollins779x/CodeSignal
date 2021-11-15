//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab11;

class InvalidTimeFormatException extends Exception {
    InvalidTimeFormatException(String message) {
        super("Error: " + message);
    }
}
