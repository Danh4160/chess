public abstract class Piece {
    private int posX;
    private int posY;
    Side side;
    boolean isDead;


    public void kill() {
        this.isDead = true;
        this.setX(-1);
        this.setY(-1);
    }

    /* Abstract methods to be implemented by the subclass */
    public abstract void move(int x, int y, boolean isEating);

    /* Getters for the piece's positions */
    public int getX() { return this.posX;};
    public int getY() { return this.posY;};

    /* Setters for the piece's positions */
    public void setX(int x) { this.posX = -1;};
    public void setY(int y) { this.posY = -1;};
}

enum Side { WHITE, BLACK }