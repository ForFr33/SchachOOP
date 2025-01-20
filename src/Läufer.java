public class Läufer extends ChessPiece{
    Läufer (int value, int owner, int xCoordinate, int yCoordinate) {
        super(value, owner, xCoordinate, yCoordinate);
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
