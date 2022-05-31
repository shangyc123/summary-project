package com.shangyc.behavioral_pattern_11.memento_pattern.chess_to_cancel;



//象棋棋子类：原发器
public class Chessman {
    private String name;
    private  int x;

    private int y;

    public Chessman(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //保存状态
    public ChessmanMemento save(){
        return new ChessmanMemento(name,x,y);
    }

    //恢复状态
    public void restore(ChessmanMemento chessmanMemento){

        this.name = chessmanMemento.getLabel();
        this.x = chessmanMemento.getX();
        this.y = chessmanMemento.getY();
    }
}
