public class Pawn extends Piece {
    private boolean hasMoved;
    private boolean promoted;


    public Pawn(int x, Side side, boolean hasMoved, Board board) {
        super(x, side == Side.BLACK ? 6 : 1, side, board);
        this.hasMoved = hasMoved;
        this.promoted = false;
    }

    @Override
    public void move(int x, int y) {
        super.move(x, y);
    }

    @Override
    public boolean canMove(int x, int y, boolean isEating) {
        if (x < 8 && x >= 0 && y < 8 && y >= 0){
            if (!this.hasMoved) {
                if (!isEating) {
                    if (this.getSide() == Side.BLACK) {
                        return (x == this.getX() && ((y - this.getY()) == -1 || (y - this.getY() == -2)) && this.board.isEmpty(x, y));
                    } else {
                        return (x == this.getX() && ((y - this.getY()) == 1 || (y - this.getY() == 2)) && this.board.isEmpty(x, y));
                    }
                } else {
                    if (this.getSide() == Side.BLACK) {
                        if (this.board.getPiece(x, y) != null) {
                            return ((Math.abs(this.getX() - x) == 1) && y == 5 && this.board.getPiece(x, y).getSide() == Side.WHITE);
                        }
                    } else {
                        if (this.board.getPiece(x, y) != null) {
                            return ((Math.abs(this.getX() - x) == 1) && y == 2 && this.board.getPiece(x, y).getSide() == Side.BLACK);
                        }
                    }
                    return false;
                }
            } else {
                if (!isEating) {
                    if (this.getSide() == Side.BLACK) {
                        return (x == this.getX() && (y - this.getY()) == -1 && this.board.isEmpty(x, y));
                    } else {
                        return (x == this.getX() && (y - this.getY() == 1) && this.board.isEmpty(x, y));
                    }
                } else {
                    if (this.getSide() == Side.BLACK) {
                        if (this.board.getPiece(x, y) != null) {
                            return (Math.abs(x - this.getX()) == 1 && (y - this.getY()) == -1 && this.board.getPiece(x, y).getSide() == Side.WHITE);
                        }
                    } else {
                        if (this.board.getPiece(x, y) != null) {
                            return (Math.abs(x - this.getX()) == 1 && (y - this.getY() == 1) && this.board.getPiece(x, y).getSide() == Side.BLACK);
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }


    @Override
    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♟" : "♙";
    }

    /* Getters */
    public boolean getHasMoved() { return this.hasMoved;};

}
