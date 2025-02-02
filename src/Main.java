public class Main {

    public static void main (String[] args) {
        ChessBoard spielBrett = new ChessBoard();
        System.out.println(spielBrett.piecesInPlay());
        spielBrett.movePiece(spielBrett.spielFeld[1][3],2,3);
        spielBrett.movePiece(spielBrett.spielFeld[7][1],5,2);
        spielBrett.movePiece(spielBrett.spielFeld[0][2],3,5);
        spielBrett.movePiece(spielBrett.spielFeld[6][7],5,7);
        spielBrett.movePiece(spielBrett.spielFeld[0][7],5,7);
        spielBrett.movePiece(spielBrett.spielFeld[7][7],5,7);
        System.out.println(spielBrett.piecesInPlay());
    }
}
