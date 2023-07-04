package com.workshop2;

import java.util.Random;
import java.util.Scanner;

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
    public static void chooseALetter(){
        char letter1='X';
        char letter2='O';

        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X or O: ");
        USER=sc.nextLine().charAt(0);

        if (USER==letter1){
            System.out.println("User has choose "+letter1);
            System.out.println("Select the Index where you want to insert");

        } else if (USER==letter2) {
            System.out.println("User has choose "+letter2);
            System.out.println("Select the Index where you want to insert");

        }else {
            System.out.println("Invaliad output try again");
        }

    }

}
