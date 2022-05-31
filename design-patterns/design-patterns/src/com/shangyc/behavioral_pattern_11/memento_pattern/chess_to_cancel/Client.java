package com.shangyc.behavioral_pattern_11.memento_pattern.chess_to_cancel;

public class Client {

    public static void main(String args[]){

        MementoCareTaker mc = new MementoCareTaker();

        Chessman chessman = new Chessman("车",2,5);

        chessman.setY(4);
        display(chessman);
        mc.setChessmanMemento(chessman.save());
        chessman.setX(5);
        display(chessman);
        System.out.println("******悔棋******");
        //恢复状态
        chessman.restore(mc.getChessmanMemento());
        display(chessman);

    }


    public static  void display(Chessman chess){
        System.out.println("棋子" + chess.getName() + "当前位置为：" + "第" + chess.getX() + "行"
                + "第" + chess.getY() + "列。");
    }
}
