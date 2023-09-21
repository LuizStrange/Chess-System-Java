package chess;

import boardgame.BoardException;

public class ChessExeption extends BoardException {

    private static final long serialVersionID = 1L;

    public ChessExeption(String msg) {
        super(msg);
    }
}
