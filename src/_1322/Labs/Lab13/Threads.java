//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab13;

import java.util.Random;

class Threads implements Runnable {
    Random randomTimer = new Random();
    String name;
    int time;
    Threads(String name) {
        this.name = name;
        time = randomTimer.nextInt(1000);
    }
    @Override
    public void run () {
        try {
            System.out.println("My name is " + name + ", I am going to sleep after: " + time + " ms");
            Thread.sleep(time);
            System.out.println("My name is " + name + ", I am awake now");
        } catch (InterruptedException ignored) {}
    }

}
