package BishopAndPawn;

class BishopAndPawn {
    static void main(String[] args) {
        String bishop = "a8", pawn = "c6";
        System.out.println(bishopAndPawn(bishop,pawn));
    }
    static boolean bishopAndPawn(String bishop, String pawn) {
        int bCol = bishop.charAt(0)-96;
        int bRow = bishop.charAt(1)-48;
        for (int col = 1; col < 9; col++)
            for (int row = 1; row < 9; row++)
                if ((col - bCol) == (row - bRow) || (bCol + bRow) == (col + row))
                    if (pawn.equals(String.valueOf((char) (col + 96)) + row)) return true;
        return false;
    }
}
