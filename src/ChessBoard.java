import java.util.LinkedList;
import java.util.List;

public class ChessBoard {

    public static ChessPiece[][] spielFeld = new ChessPiece[8][8];

    ChessBoard () {
    spielFeld [0][0] = new Turm(5,1,0,0,"T");
    spielFeld [0][1] = new Springer(3,1,0,1,"S");
    spielFeld [0][2] = new Laeufer(3,1,0,2,"L");
    spielFeld [0][3] = new Dame(9,1,0,3,"D");
    spielFeld [0][4] = new Koenig(Integer.MAX_VALUE,1,0,4,"K");
    spielFeld [0][5] = new Laeufer(3,1,0,5,"L");
    spielFeld [0][6] = new Springer(3,1,0,6,"S");
    spielFeld [0][7] = new Turm(5,1,0,7,"T");
        for (int y = 0; y <= 7; y += 1) {
            spielFeld [1][y] = new Bauer(1,1,1,y,"B");
        }
    spielFeld [7][0] = new Turm(5,-1,7,0,"T");
    spielFeld [7][1] = new Springer(3,-1,7,1,"S");
    spielFeld [7][2] = new Laeufer(3,-1,7,2,"L");
    spielFeld [7][3] = new Dame(9,-1,7,3,"D");
    spielFeld [7][4] = new Koenig(Integer.MAX_VALUE,-1,7,4,"K");
    spielFeld [7][5] = new Laeufer(3,-1,7,5,"L");
    spielFeld [7][6] = new Springer(3,-1,7,6,"S");
    spielFeld [7][7] = new Turm(5,-1,7,7,"T");
        for (int y = 0; y <= 7; y += 1) {
            spielFeld [6][y] = new Bauer(1,-1,6,y,"B");
        }
    }

    /**
     * Erstellt eine Liste der aktiven Figuren.
     * Filtert das Feld spielFeld der KLasse ChessBoard nach ChessPiece[] Arrays
     * und speichert Elemente ChessPiece[i] in einer Liste, falls diese nicht = null sind.
     * @return Liste mit allen Elementen in spielFeld, die nicht = null sind.
     */
    public List<ChessPiece> piecesInPlay() {
        List<ChessPiece> pieces = new LinkedList<ChessPiece>();
        for (int i = 0; i <= 7; i+=1) {
            for (ChessPiece[] x : spielFeld) {
                if (x[i] != null) {
                    pieces.add(x[i]);
                }
            }
        }
        return pieces;
    }

    public void currentGameStatus(ChessPiece[][] x) {
        currentGameStatus(x);
    }

    /**
     * Bewegt eine Figur auf ein anderes Feld.
     * @param piece
     * @param x x-Koordinate des Feldes, auf das die Figur bewegt werden soll.
     * @param y y-Koordinate des Feldes, auf das die Figur bewegt werden soll.
     * @return true, falls
     */
    public boolean movePiece (ChessPiece piece, int x, int y) {
        while (piece.canMove(x,y) == true ) {
            if (x > piece.getxCoordinate()) {
                piece.xCoordinate += 1;
            } else if (x < piece.getxCoordinate()) {
                piece.xCoordinate -= 1;
            }
            if (y > piece.getyCoordinate()) {
                piece.yCoordinate += 1;
            } else if (y < piece.getyCoordinate()) {
                piece.yCoordinate -= 1;
            }

        }
        return false;
    }


}
