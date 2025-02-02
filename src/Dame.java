public class Dame extends ChessPiece {

    Dame (int value, int owner, int xCoordinate, int yCoordinate, String symbol) {
        super(value, owner, xCoordinate, yCoordinate, symbol);
    }

    /**
     * Gibt an, ob die Figur Dame sich bewegen kann oder nicht.
     * Nimmt die x und y Koordinate eines Feldes entgegen und
     * prüft, ob die Dame das Feld erreichen kann.
     * @param x x-Koordinate des zu erreichenden Feldes.
     * @param y y-Koordinate des zu erreichenden Feldes.
     * @return true, wenn das Feld zu erreichen ist, sonst false.
     */
    @Override
    public boolean canMove(int x, int y) {
        if ((x < 0 || x > 7) || (y < 0 || y > 7)) {
            return false;
        }
        boolean result = false;
        if (y != getyCoordinate() && x == getxCoordinate()) {
            result = true;
        } else if (x != getxCoordinate() && y == getyCoordinate()) {
            result = true;
        }
        if (Math.abs(x - getxCoordinate()) == Math.abs(y - getyCoordinate())) {
            result = true;
        }
        return result;
    }
}
