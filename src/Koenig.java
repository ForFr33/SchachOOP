public class Koenig extends ChessPiece{

    Koenig (int value, int owner, int xCoordinate, int yCoordinate,String symbol) {
        super(value, owner, xCoordinate, yCoordinate, symbol);
    }

    /**
     * Gibt an, ob die Figur Koenig sich bewegen kann oder nicht.
     * Nimmt die x und y Koordinaten eines Feldes entgegen und
     * prüft, ob der Koenig das Feld erreichen kann.
     * @param x x-Koordinate des zu erreichenden Feldes.
     * @param y y-Koordinate des zu erreichenden Feldes.
     * @return true, wenn das Feld zu erreichen ist, sonst false.
     */
    @Override
    public boolean canMove(int x, int y) {
        boolean result = true;
        if (x < getxCoordinate() - 1 || x > getxCoordinate() + 1) {
            result = false;
        } else if (y < getyCoordinate() - 1 || y > getyCoordinate() + 1) {
            result = false;
        }
        return result;
    }

}
