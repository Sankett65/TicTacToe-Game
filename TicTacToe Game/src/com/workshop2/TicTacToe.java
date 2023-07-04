package com.workshop2;

public class TicTacToe {
    public static char USER;

    public static char[] board = new char[10];
    public static void assignEmptySpace(){
        char c=' ';
        for (char i=0;i<board.length;i++){
            board[i]=c;
            System.out.println(board[i]);
        }
    }
}
