package com.example.javadatascructure;

import java.util.Arrays;

public class The2dArrays {

    public static void main(String[] args) {

        char[][] board = new char[3][3];

        System.out.println(board.length);

        for (int i=0; i<board.length; i++){
            for (int j=0; j<board.length; j++){
                board[i][j] = '-';
            }
        }

        char[][] boardTwo = new char[][]{
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'},
                new char[]{'0', '-', '-'}
        };

        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
