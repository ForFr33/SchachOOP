public abstract class ChessPiece {
    protected int value;
    protected int owner;
    public int xCoordinate;
    public int yCoordinate;

    ChessPiece (int value, int owner, int xCoordinate, int yCoordinate){
        this.value = value;
        this.owner = owner;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return this.xCoordinate;
    }

    public int getyCoordinate () {
        return this.yCoordinate;
    }

    public boolean canMove(int x, int y) {
        return true;
    }


}
