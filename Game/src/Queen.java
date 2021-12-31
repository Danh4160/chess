public class Queen extends Piece {

    public Queen(int x, Side side, Board board) {
        super(x, side == Side.BLACK ? 7 : 0, side, board);
    }

    public boolean canMove(int x, int y, boolean isEating) {
        if (x < 8 && x >= 0 && y < 8 && y >= 0) {
            // Up down
            boolean inTheWay = false;
            if (x == this.getX() && y != this.getY()) {
                // check if pieces are in its way
                if (y > this.getY()) {
                    for (int i = this.getY(); i <= y; i++) {
                        if (!this.board.isEmpty(this.getX(), i)) {
                            inTheWay = true;
                            break;
                        }
                    }
                }
                else {
                    for (int i = y; i <= this.getY(); i++) {
                        if (!this.board.isEmpty(this.getX(), i)) {
                            inTheWay = true;
                            break;
                        }
                    }
                }
                return !inTheWay;
            }
            // Right left
            else if (y == this.getY() && x != this.getX()) {
                if (x > this.getX()) {
                    for (int i = this.getX(); i <= x; i++) {
                        if (!this.board.isEmpty(i, this.getY())) {
                            inTheWay = true;
                            break;
                        }
                    }
                }
                else {
                    for (int i = x; i <= this.getX(); i++) {
                        if (!this.board.isEmpty(i, this.getY())) {
                            inTheWay = true;
                            break;
                        }
                    }
                }
                return !inTheWay;
            }
            // Like bishop
            else {
                // Calculate the slope of the bishops movement.
                int deltaX;
                int deltaY;
                double slope;

                deltaX = x - this.getX();
                deltaY = y - this.getY();
                slope = deltaY / deltaX;
                if (slope == 1 || slope == -1) {
                    if (!isEating) {
                        return this.board.isEmpty(x, y);
                    }
                    else {
                        if (this.board.getPiece(x, y) != null) {
                            if (this.getSide() == Side.WHITE) {
                                return this.board.getPiece(x, y).getSide() == Side.BLACK;
                            }
                            else {
                                return this.board.getPiece(x, y).getSide() == Side.WHITE;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♛" : "♕";
    }

}
