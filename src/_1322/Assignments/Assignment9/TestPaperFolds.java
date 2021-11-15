//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins

package _1322.Assignments.Assignment9;

class TestPaperFolds {
    public static void main(String[] args) {        //Calls method paperFold for each fold
        for (int i = 1;i <= 5; i++) System.out.println("For " + i + " folds we get: " + paperFold(i));
    }
    private static String paperFold (int counter) {
        if (--counter < 0) return "";               //Recursion progression and exit condition
        String fold = paperFold(counter);
        return mirror(fold) + "v" + fold;           //Concatenation of fold
    }
    private static String mirror(String fold){      //Stores new string in the reverse order and swaps ^ with v and v with ^
        StringBuilder reverse = new StringBuilder();
        for (int i = fold.length()-1;i >= 0; i--) reverse.append((fold.charAt(i) == 'v') ? "^" : "v");
        return reverse.toString();                  //Returns mirror of String fold
    }
}
