//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package Threads;

class ThreadsDriver {
    static void main(String[] args) {
        System.out.println("Program will Now Start:");
        Thread threadOne = new Thread(new Threads("Thread1"));
        Thread threadTwo = new Thread(new Threads("Thread2"));
        threadOne.start();
        threadTwo.start();
    }
}
