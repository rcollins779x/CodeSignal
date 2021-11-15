package _1322.Assignments.Assignment12.MultiThreading_Java;

import java.util.List;

class HelperClass implements Runnable {
	private final List<String> words;

    HelperClass(List<String> words) {
        this.words = words;
    }

    //function which replaces <>
    static void ReplaceHTML(List<String> tws1) {

        /* Write your logic to replace the tags and print the text here */
    	System.out.println("Replacing html");
    }

	@Override
	public void run() {
		HelperClass.ReplaceHTML(this.words);
	}
}
