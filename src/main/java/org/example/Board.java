package org.example;

import java.util.Arrays;

public class Board {
    public void newBoard(int pos) {
        //объявляем размер поля
        int[][] board = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[j][i] = 0;
            }
        }
        //вывод поля на экран
//        for (int i = 0; i < board.length; i++) {
//            System.out.println(Arrays.toString(board[i]));
//        }

//        int[][] figOnBoard = new Fig1().fig1();
        int[][] fig = new Fig1().fig1();

        System.out.println(" \u001B[31mСмещение относительно нуля (pos)\u001B[0m" + pos);
        if (pos < 8 && pos>0) {
            //рисуем фигуру на доске
            for (int i = 0; i < fig.length; i++) {
                for (int j = 0; j < 2; j++) {
                    board[i][pos + j] = fig[i][j];
                }
            }
            for (int i = 0; i < board.length; i++) {
                System.out.println(Arrays.toString(board[i]));
            }


        }
    }
}



//
//        int pos  = new Position().position();
//        int position = pos;
//        System.out.println(position);


