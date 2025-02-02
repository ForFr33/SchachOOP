
public class Bauer extends ChessPiece{
    Bauer (int value, int owner, int xCoordinate, int yCoordinate, String symbol) {
        super(value, owner, xCoordinate, yCoordinate, symbol);
    }

    /**
     * Gibt an, ob die Figur Bauer sich bewegen kann oder nicht.
     * Nimmt die x und y Koordinate eines Feldes entgegen und
     * prüft, ob der Bauer das Feld erreichen kann.
     * @param x x-Koordinate des zu erreichenden Feldes.
     * @param y y-Koordinate des zu erreichenden Feldes.
     * @return true, wenn das Feld zu erreichen ist, sonst false.
     */
    @Override
    public boolean canMove(int x, int y) {
        if ((x < 0 || x > 7) || (y < 0 || y > 7)) {
            return false;
        }
        if (getxCoordinate() + 1 == x && this.owner == 1) {
            return true;
        } else if (getxCoordinate() - 1 == x && this.owner == -1) {
            return true;
        } else
            return false;
    }
}
