public abstract class Piece {
    private int posX;
    private int posY;
    Side side;
    private boolean isDead;
    public Board board;

    public Piece(int posX, int posY, Side side, Board board) {
        this.posX = posX;
        this.posY = posY;
        this.side = side;
        this.board = board;
    }

    public void kill() {
        this.isDead = true;
        this.posX = -1;
        this.posY = -1;
    }

    public void move(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    /* Abstract methods to be implemented by the subclass */
    public abstract boolean canMove(int x, int y, boolean isEating);
    public abstract String getSymbol();

    /* Getters for the piece's positions */
    public int getX() { return this.posX; };
    public int getY() { return this.posY; };
    public Side getSide() { return this.side; };
    public boolean getIsDead() { return this.isDead; };

    /* Setters for the piece's positions */
    public void setX(int x) { this.posX = -1; };
    public void setY(int y) { this.posY = -1; };
    public void setSide(Side side) { this.side = side; };
    public void setIsDead(boolean isDead) { this.isDead = isDead; };

}

enum Side { WHITE, BLACK }