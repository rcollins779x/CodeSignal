package SeatsInTheather;

class SeatsInTheather {
    static void main (String[] args) {
        int nCols = 16, nRows = 11, col = 5, row = 3;
        System.out.println(seatsInTheater(nCols,nRows,col,row));
    }
    static int seatsInTheater(int nCols, int nRows, int col, int row) {
        return ((nCols - col + 1) * (nRows - row));
    }

}
