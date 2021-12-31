public class Bishop extends Piece {

    public Bishop(int x, Side side, Board board) {
        super(x, side == Side.BLACK ? 7 : 0, side, board);
    }

    public boolean canMove(int x, int y, boolean isEating) {

         if (x >= 0 && x < 8 && y >=0 && y < 8) {
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
        return false;
    }

    public String getSymbol() {
        return this.getSide() == Side.BLACK ? "♝" : "♗";
    }
}
