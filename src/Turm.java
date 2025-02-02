public class Turm extends ChessPiece{

    Turm (int value, int owner, int xCoordinate, int yCoordinate, String symbol) {
        super(value, owner, xCoordinate, yCoordinate, symbol);
    }

    /**
     * Gibt an, ob die Figur Turm sich bewegen kann oder nicht.
     * Nimmt die x und y Koordinate eines Feldes entgegen und
     * prüft, ob der Turm das Feld erreichen kann.
     * @param x x-Koordinate des zu erreichenden Feldes.
     * @param y y-Koordinate des zu erreichenden Feldes.
     * @return true, wenn das Feld zu erreichen ist, sonst false.
     */
    @Override
    public boolean canMove(int x, int y) {
        if ((x < 0 || x > 7) || (y < 0 || y > 7)) {
            return false;
        }
        if (y != getyCoordinate() && x == getxCoordinate()) {
            return true;
        } else if (x != getxCoordinate() && y == getyCoordinate()) {
            return true;
        } else
        return false;
    }

}
