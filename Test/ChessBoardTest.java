import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardTest {
    @Test
    void movePiece() {
        ChessBoard spielBrett = new ChessBoard();
        assertFalse(spielBrett.movePiece(spielBrett.spielFeld[7][0],6,0));
        assertTrue(spielBrett.movePiece(spielBrett.spielFeld[7][0],1,0));
        assertEquals(1,spielBrett.spielFeld[1][0].getxCoordinate());
        assertEquals(null,spielBrett.spielFeld[7][0]);
        assertTrue(spielBrett.movePiece(spielBrett.spielFeld[1][0],1,1));
    }
}