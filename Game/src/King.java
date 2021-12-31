public class King extends Piece {
    private boolean isChecked;

    public King(int x, Side side, Board board) {
        super(x, side == Side.BLACK ? 7 : 0, side, board);
    }

    public boolean canMove(int x, int y, boolean isEating) {
        return false;
    }

    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♚" : "♔";
    }


}
