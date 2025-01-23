public class Turm extends ChessPiece{

    Turm (int value, int owner, int xCoordinate, int yCoordinate, String symbol) {
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
        if (y != getyCoordinate() && x == getxCoordinate()) {
            return true;
        } else if (x != getxCoordinate() && y == getyCoordinate()) {
            return true;
        } else
        return false;
    }

}
