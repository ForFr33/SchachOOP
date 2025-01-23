
public class Bauer extends ChessPiece{
    Bauer (int value, int owner, int xCoordinate, int yCoordinate, String symbol) {
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
        if (getxCoordinate() + 1 == x && this.owner == 1) {
            return true;
        } else if (getxCoordinate() - 1 == x && this.owner == -1) {
            return true;
        } else
            return false;
    }
}
