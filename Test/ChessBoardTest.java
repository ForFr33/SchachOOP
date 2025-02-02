import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardTest {

    @Test
    void piecesInPlay() {
    }

    @Test
    void currentGameStatus() {
    }

    @Test
    void movePiece() {
    Dame d = new Dame(9,1,0,3,"D");
    assertTrue(ChessBoard.movePiece(d,6,3));
    Turm t = new Turm(5,-1,7,6,"T");
    assertFalse(ChessBoard.movePiece(t,6,0));
    }
}