public class Laeufer extends ChessPiece{
    Laeufer (int value, int owner, int xCoordinate, int yCoordinate, String symbol) {
        super(value, owner, xCoordinate, yCoordinate, symbol);
    }

    /**
     * Gibt an, ob die Figur Lauefer sich bewegen kann oder nicht.
     * Nimmt die x und y Koordinate eines Feldes entgegen und
     * prüft, ob der Lauefer das Feld erreichen kann.
     * @param x x-Koordinate des zu erreichenden Feldes.
     * @param y y-Koordinate des zu erreichenden Feldes.
     * @return true, wenn das Feld zu erreichen ist, sonst false.
     */
    @Override
    public boolean canMove(int x, int y) {
        boolean result = false;
        if (Math.abs(x - getxCoordinate()) == Math.abs(y - getyCoordinate())) {
            result = true;
        }
        return result;
    }
}
