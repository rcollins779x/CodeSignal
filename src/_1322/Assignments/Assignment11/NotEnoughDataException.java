//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment11;

class NotEnoughDataException extends Throwable {
    NotEnoughDataException(String message) {
        super("\033[0;31mError: Not Enough Data lines.");
    }
}
