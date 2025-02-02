import static org.junit.jupiter.api.Assertions.*;

class ChessPieceTest {

    @org.junit.jupiter.api.Test
    void getxCoordinate() {
        Bauer Bauer = new Bauer(1,1,1,0,"S");
        assertEquals(1,Bauer.getxCoordinate());
    }

    @org.junit.jupiter.api.Test
    void getyCoordinate() {
        Bauer Bauer = new Bauer(1,1,6,0,"S");
        assertEquals(5,Bauer.getyCoordinate());
    }

    @org.junit.jupiter.api.Test
    void canMove() {
        Koenig k = new Koenig(Integer.MAX_VALUE,1,4,4,"K");
        assertTrue(k.canMove(5,3));
        assertFalse(k.canMove(8,3));
        Dame d = new Dame(9,1,3,3,"D");
        assertTrue(d.canMove(0,6));
        assertFalse(d.canMove(7,4));
        Laeufer l = new Laeufer(3,-1,5,7,"L");
        assertTrue(l.canMove(0,2));
        assertFalse(l.canMove(0,3));
        Springer s = new Springer(3,1,2,2,"S");
        assertTrue(s.canMove(1,4));
        assertFalse(s.canMove(2,4));
        Turm t = new Turm(5,-1,0,0,"T");
        assertTrue(t.canMove(5,0));
        assertFalse(t.canMove(3,3));
        Bauer b = new Bauer(1,1,1,2,"B");
        assertFalse(b.canMove(0,3));
        assertTrue(b.canMove(2,2));
        Bauer b1 = new Bauer(1,-1,6,3,"B");
        assertFalse(b1.canMove(7,3));
        assertFalse(b1.canMove(6,2));
    }

}