public abstract class ChessPiece {
    protected final int value;
    protected final int owner;
    protected final String symbol;
    public int xCoordinate;
    public int yCoordinate;

    ChessPiece (int value, int owner, int xCoordinate, int yCoordinate, String symbol){
        this.value = value;
        this.owner = owner;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.symbol = symbol;
    }

    public int getxCoordinate() {
        return this.xCoordinate;
    }

    public int getyCoordinate () {
        return this.yCoordinate;
    }

    public abstract boolean canMove(int x, int y);


}
