package com.shangyc.behavioral_pattern_11.memento_pattern.chess_to_cancel;


public class MementoCareTaker {

    public ChessmanMemento chessmanMemento;

    public ChessmanMemento getChessmanMemento() {
        return chessmanMemento;
    }

    public void setChessmanMemento(ChessmanMemento chessmanMemento) {
        this.chessmanMemento = chessmanMemento;
    }
}