public class Springer extends  ChessPiece{

    Springer (int value, int owner, int xCoordinate, int yCoordinate, String symbol) {
        super(value, owner, xCoordinate, yCoordinate, symbol);
    }

    /**
     * Gibt an, ob die Figur Springer sich bewegen kann oder nicht.
     * Nimmt die x und y Koordinate eines Feldes entgegen und
     * prüft, ob der Springer das Feld erreichen kann.
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
        if ((x == getxCoordinate() + 2 || x == getxCoordinate() - 2) && (y == getyCoordinate() + 1 || y == getyCoordinate() - 1)) {
            result = true;
        }  else if ((y == getyCoordinate() + 2 || y == getyCoordinate() - 2) && (x == getxCoordinate() + 1 || x == getxCoordinate() - 1)) {
            result = true;
        }
        return result;
    }
}
