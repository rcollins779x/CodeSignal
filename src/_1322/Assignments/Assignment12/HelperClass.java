//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment12;

import java.util.List;

class HelperClass implements Runnable {
    private final List<String> words;
    private final String name;

    HelperClass(List<String> words, String name) {
        this.words = words;
        this.name = name;
    }

    static void ReplaceHTML(List<String> tws1, String name) {

        for (String temp : tws1) {
            while (temp.matches(".*<.*"))
                temp = temp.replaceAll("(.*)<.*>(.*)", "$1$2");
            System.out.println(name + "\ttemp: " + temp);
        }
    	System.out.println("Html Replaced");
    }

	@Override
	public void run() {
        HelperClass.ReplaceHTML(this.words, this.name);
    }
}
