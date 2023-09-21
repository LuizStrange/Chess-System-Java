import chess.ChessPiece;
import chess.ChessPosition;
import chess.Chessmatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chessmatch chessmatch = new Chessmatch();

        while (true) {
            UI.printBoard(chessmatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturePiece = chessmatch.performChessMove(source, target);
        }

    }   
}