public class Main {

    public static void main (String[] args) {
        ChessBoard Brett = new ChessBoard();
        for (int i = 0; i <= 7; i += 1) {
            System.out.println(ChessBoard.spielFeld[i][6]);
        }
        System.out.println(Brett.piecesInPlay());
        System.out.println(ChessBoard.movePiece(ChessBoard.spielFeld[0][1],2,0));
        System.out.println(Brett.piecesInPlay());
    }
}
