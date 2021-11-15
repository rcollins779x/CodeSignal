package NQueens;

class Board {
private char [][] grid;
private int size;

    static void println(Object text) { System.out.println(text); }
    static void print(Object text) { System.out.print(text); }

    Board(int size) {
        grid = new char[this.size = size][];
        for(int i = 0; i < size; i++) {
            grid[i] = new char[size];
            for(int j = 0; j < size; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    @Override
    public String toString() {
        print(" ");
        for (int j = 0; j < size; j++)
            print("-");
        println("");
        for(int i = 0; i < size; i++) {
            print("|");
            for (int j = 0; j < size; j++) {
                print(grid[i][j]);
            }
            println("|");
        }
        print(" ");
        for (int j = 0; j < size; j++)
            print("-");
        return "";
    }
}
