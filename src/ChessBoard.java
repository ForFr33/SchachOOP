import java.util.List;

public class ChessBoard {

    public ChessPiece[][] spielFeld = new ChessPiece[8][8];

    ChessBoard () {
    spielFeld [0][0] = new Turm(3,1,0,0,"T");
    spielFeld [0][1] = new Springer(3,1,0,1,"S");
    spielFeld [0][2] = new Laeufer(3,1,0,2,"L");
    spielFeld [0][3] = new Dame(3,1,0,3,"D");
    spielFeld [0][4] = new Koenig(3,1,0,4,"K");
    spielFeld [0][5] = new Laeufer(3,1,0,5,"L");
    spielFeld [0][6] = new Springer(3,1,0,6,"S");
    spielFeld [0][7] = new Turm(3,1,0,7,"T");
    spielFeld [1][0] = new Bauer(1,1,1,0,"B");
    spielFeld [1][1] = new Bauer(1,1,1,1,"B");
    spielFeld [1][2] = new Bauer(1,1,1,2,"B");
    spielFeld [1][3] = new Bauer(1,1,1,3,"B");
    spielFeld [1][4] = new Bauer(1,1,1,4,"B");
    spielFeld [1][5] = new Bauer(1,1,1,5,"B");
    spielFeld [1][6] = new Bauer(1,1,1,6,"B");
    spielFeld [1][7] = new Bauer(1,1,1,7,"B");
    spielFeld [7][0] = new Turm(3,-1,7,0,"T");
    spielFeld [7][1] = new Springer(3,-1,7,1,"S");
    spielFeld [7][2] = new Laeufer(3,-1,7,2,"L");
    spielFeld [7][3] = new Dame(3,-1,7,3,"D");
    spielFeld [7][4] = new Koenig(3,-1,7,4,"K");
    spielFeld [7][5] = new Laeufer(3,-1,7,5,"L");
    spielFeld [7][6] = new Springer(3,-1,7,6,"S");
    spielFeld [7][7] = new Turm(3,-1,7,7,"T");
    spielFeld [6][0] = new Bauer(1,-1,6,0,"B");
    spielFeld [6][1] = new Bauer(1,-1,6,1,"B");
    spielFeld [6][2] = new Bauer(1,-1,6,2,"B");
    spielFeld [6][3] = new Bauer(1,-1,6,3,"B");
    spielFeld [6][4] = new Bauer(1,-1,6,4,"B");
    spielFeld [6][5] = new Bauer(1,-1,6,5,"B");
    spielFeld [6][6] = new Bauer(1,-1,6,6,"B");
    spielFeld [6][7] = new Bauer(1,-1,6,7,"B");

    }

    public List<ChessPiece> piecesInPlay() {
        return null;
    }

}
