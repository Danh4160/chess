public class Pawn extends Piece {
    private boolean hasMoved;
    private boolean promoted;

    public Pawn(int x, Side side, boolean hasMoved) {
        super(x, side == Side.BLACK ? 6 : 1, side);
        this.hasMoved = hasMoved;
        this.promoted = false;
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    @Override
    public boolean canMove(int x, int y, boolean isEating) {

        if (!isEating) {
            // Check for valid moves of the pawn
            if (this.getSide() == Side.WHITE) {
                if (x > this.getX() && y == this.getY()) {
                    this.setX(x);
                    this.setY(y);
                    return true;
                }
            }
            else if (this.getSide() == Side.BLACK) {
                if (x < this.getX() && y == this.getY()) {
                    this.setX(x);
                    this.setY(y);
                    return true;
                }
            }
            return false;
        }
        else {
            // Get the piece at that position then call kill();
            // Can only kill in diagonal
        }
        return true;
    }


    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♟" : "♙";
    }

    /* Getters */
    public boolean getHasMoved() { return this.hasMoved;};

}
