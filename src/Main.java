import chess.Chessmatch;

public class Main {
    public static void main(String[] args) {
        Chessmatch chessmatch = new Chessmatch();

        UI.printBoard(chessmatch.getPieces());
    }
}