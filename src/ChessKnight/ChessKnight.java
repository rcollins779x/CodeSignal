package ChessKnight;

class ChessKnight {
    static void main(String[] args) {
        String cell = "a3";
        System.out.println(chessKnight(cell));
    }
    static int chessKnight(String cell) {
        int vert = cell.charAt(0)-96, horz = cell.charAt(1)-48, count =0;
        System.out.println("vert = " + vert);
        System.out.println("horz = " + horz);
        if (vert + 2 < 9) {
            if (horz + 1 < 9) count++;
            if (horz - 1 > 0) count++;
        }
        if (vert - 2 > 0) {
            if (horz + 1 < 9) count++;
            if (horz - 1 > 0) count++;
        }
        if (horz + 2 < 9) {
            if (vert + 1 < 9) count++;
            if (vert - 1 > 0) count++;
        }
        if (horz - 2 > 0) {
            if (vert + 1 < 9) count++;
            if (vert - 1 > 0) count++;
        }

        return count;
    }
}
