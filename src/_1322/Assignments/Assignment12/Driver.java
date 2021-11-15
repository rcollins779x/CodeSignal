//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Assignments.Assignment12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Driver {

	public static void main(String[] args) throws FileNotFoundException {

		String directory = "src/" + (Driver.class.getPackage().getName()).replaceAll("\\.","/") + "/";

		File file = new File(directory + "w3.org.htm");
		Scanner s = new Scanner(file);//Reading the file

		ArrayList<ArrayList<String>> newList = new ArrayList<>() {{ add(new ArrayList<>()); add(new ArrayList<>()); }};

		for(int i = 0; s.hasNextLine(); i++)
			newList.get(i % 2).add(s.nextLine());

		System.out.println(0 + " " + newList.get(0));
		System.out.println(1 + " " + newList.get(1));

		HelperClass tws1 = new HelperClass(newList.get(0), "Thread 1");		//Setting up threads to do the replacing
		HelperClass tws2 = new HelperClass(newList.get(1), "Thread 2");

		Scanner myObj = new Scanner(System.in);
		String choice;
		do {
			do {
				System.out.println("Choose the function you would like to run:");
				System.out.println("0-Exit and Thought Response\n1-No Thread Test\n2-Thread Test");
				choice = myObj.nextLine();
			} while (!choice.matches("\\d"));

			switch (Integer.parseInt(choice)) {
				case 0:	break;
				case 1:	NoThreadTest(newList.get(0), newList.get(1)); break;
				case 2:	ThreadTest(tws1, tws2);	break;
			}
		} while (!choice.equals("0"));
		System.out.println("Write a short response (not more than 3 sentences or 100 words) explaining \n" +
				"the improvement in time taken for processing data when using multi-threading.\n");
		System.out.println("Response: After increasing the sample text to 100,000 lines to ensure a long enough test,\n" +
				"a peculiar result keeps repeating. Regardless of threaded or not, with each iteration the speed it \n" +
				"takes to perform the strip continues to improve. When comparing threaded vs not and comparing the \n" +
				"1st iteration of each, threaded was only slightly faster and sometimes slower than threaded. My \n" +
				"conclusion is that string manipulation may not be very CPU intense and isn't an ideal candidate to\n" +
				"illustrate where multi-threading far exceed single threading code.");
		myObj.close(); s.close();
	}
	
	//Removes the html characters without using threads.
    private static void NoThreadTest(ArrayList<String> tws1, ArrayList<String> tws2) {

		long startTime = System.currentTimeMillis();										//start timer
    	HelperClass.ReplaceHTML(tws1,"No Thread");
    	HelperClass.ReplaceHTML(tws2,"No Thread");

	    long elapsedTime = System.currentTimeMillis() - startTime;							//stop times
	    System.out.println("Without Thread Runtime in milliseconds: " + elapsedTime);
    }
    
    //Removes the html characters using threads.
    private static void ThreadTest(HelperClass tws1, HelperClass tws2) {

    	long startTime = System.currentTimeMillis();										//start timer
		Thread threadOne = new Thread(tws1);
		Thread threadTwo = new Thread(tws2);
		threadOne.start();
		threadTwo.start();

		try {																				//Waits for threads to stop
			threadOne.join();
			threadTwo.join();
		} catch (InterruptedException ignored) {}

	    long elapsedTime = System.currentTimeMillis() - startTime;							//stop times
		System.out.println("Thread Runtime in milliseconds: " + elapsedTime);
    }
}
