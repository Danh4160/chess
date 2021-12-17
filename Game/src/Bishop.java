public class Bishop extends Piece {

    public Bishop(int x, Side side) {
        super(x, side == Side.BLACK ? 7 : 0, side);
    }

    public boolean canMove(int x, int y, boolean isEating) {
        return false;
    }

    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♝" : "♗";
    }
}
