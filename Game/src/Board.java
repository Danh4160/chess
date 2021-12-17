public class Board {
    public static int rows = 8;
    public static int columns = 8;
    Piece[][] board;

    public Board() {
        board = new Piece[rows][columns];
    }

    public void setPawns(Board board) {
        // Setup pawns
        for (int x = 0; x < 7; x++) {
            Pawn bp = new Pawn(x, Side.BLACK, false);
            Pawn wp = new Pawn(x, Side.WHITE, false);
            board.board[6][x] = bp;
            board.board[1][x] = wp;
        }
    }

    public void setRooks(Board board) {
        Rook br1 = new Rook(0, Side.BLACK);
        Rook br2 = new Rook(7, Side.BLACK);
        board.board[br1.getY()][br1.getX()] = br1;
        board.board[br2.getY()][br2.getX()] = br2;

        Rook wr1 = new Rook(0, Side.WHITE);
        Rook wr2 = new Rook(7, Side.WHITE);
        board.board[wr1.getY()][wr1.getX()] = wr1;
        board.board[wr2.getY()][wr2.getX()] = wr2;
    }

    public void setBishops(Board board) {
        Bishop bb1 = new Bishop(2, Side.BLACK);
        Bishop bb2 = new Bishop(5, Side.BLACK);
        board.board[bb1.getY()][bb1.getX()] = bb1;
        board.board[bb2.getY()][bb2.getX()] = bb2;

        Bishop wb1 = new Bishop(2, Side.WHITE);
        Bishop wb2 = new Bishop(5, Side.WHITE);
        board.board[wb1.getY()][wb1.getX()] = wb1;
        board.board[wb2.getY()][wb2.getX()] = wb2;
    }

    public void setKnights(Board board) {
        Knight bk1 =  new Knight(1, Side.BLACK);
        Knight bk2 =  new Knight(2, Side.BLACK);
        board.board[bk1.getY()][bk1.getX()] = bk1;
        board.board[bk2.getY()][bk2.getX()] = bk2;

        Knight wk1 =  new Knight(1, Side.BLACK);
        Knight wk2 =  new Knight(2, Side.BLACK);
        board.board[wk1.getY()][wk1.getX()] = wk1;
        board.board[wk2.getY()][wk2.getX()] = wk2;

    }

    public void setKings(Board board) {
        King bk = new King(4, Side.BLACK);
        King wk = new King(4, Side.WHITE);

        board.board[bk.getY()][bk.getX()] = bk;
        board.board[wk.getY()][wk.getX()] = wk;
    }

    public void setQueens(Board board) {
        Queen bq = new Queen(3, Side.BLACK);
        Queen wq = new Queen(3, Side.WHITE);

        board.board[bq.getY()][bq.getX()] = bq;
        board.board[wq.getY()][wq.getX()] = wq;
    }

    public String toString(Board board) {

        return null;
    }
}
