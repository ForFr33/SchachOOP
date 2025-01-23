public class Koenig extends ChessPiece{

    Koenig (int value, int owner, int xCoordinate, int yCoordinate,String symbol) {
        super(value, owner, xCoordinate, yCoordinate, symbol);
    }

    @Override
    public int getxCoordinate() {
        return this.xCoordinate;
    }

    @Override
    public int getyCoordinate() {
        return this.yCoordinate;
    }

    @Override
    public boolean canMove(int x, int y) {
        return true;
    }

}
