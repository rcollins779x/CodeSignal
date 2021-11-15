package _3642.N_Queens_Problem;

import static _3642.N_Queens_Problem.board.Board.*;

public class Driver {
    public static void main(String[] args) {

        System.out.println("***** N-Queens Problem *****"); //title

        getDimension();

        setup();
        double timer = System.currentTimeMillis();
        boolean verbose = false;
        solutionFinder(verbose);
        double finish = System.currentTimeMillis() - timer;

        System.out.println(finish / 1000 + " seconds.");

    }
}
