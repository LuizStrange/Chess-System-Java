package application;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.ArrayList;
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ChessMatch chessmatch = new ChessMatch();
        List<ChessPiece> captured = new ArrayList<>();

        while (!chessmatch.getCheckMate()) {
            try {
                application.UI.printMatch(chessmatch, captured);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = application.UI.readChessPosition(sc);

                boolean[][] possibleMoves = chessmatch.possibleMoves(source);
                application.UI.printBoard(chessmatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = application.UI.readChessPosition(sc);

                ChessPiece capturedPiece = chessmatch.performChessMove(source, target);

                if(capturedPiece != null) {
                    captured.add(capturedPiece);
                }
            }
            catch (ChessException | InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

        UI.printMatch(chessmatch, captured);


    }   
}