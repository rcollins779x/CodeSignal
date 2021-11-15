package ChessBoardCellColor;

class ChessBoardCellColor {
    static void main (String[] args) {
        String cell1 = "A1", cell2 = "H3";
        System.out.println(chessBoardCellColor(cell1,cell2));
    }
    static boolean chessBoardCellColor(String cell1, String cell2) {
        return (cell1.charAt(0)-64 + cell1.charAt(1) + cell2.charAt(0)-64 + cell2.charAt(1))%2 == 0;
    }
}
