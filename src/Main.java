import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessmatch = new ChessMatch();

        while (true) {
            try {
                application.UI.printBoard(chessmatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = application.UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessmatch.possibleMoves(source);
                application.UI.printBoard(chessmatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = application.UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
            }
            catch (ChessException | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }



    }   
}