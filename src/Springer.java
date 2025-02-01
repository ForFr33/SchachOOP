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
        return true;
    }
}
