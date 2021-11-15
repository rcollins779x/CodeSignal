package _3642.N_Queens_Problem.board;

public abstract class Piece {
    private final String symbol;

    public Piece(String symbol) { this.symbol = symbol; }

    public String getSymbol(){
        return symbol;
    }

}
