/**
 * Created By Dineth Panditha
 * Date :2/27/2023
 * Time :3:05 PM
 * Project Name :snakeGame
 */
package com.company;

public class Main {
    public static void main(String[] args) {

        char[][] g_board = {
                {' ', '|', ' ', '|', ' '},
                {'-', '|', '-', '|', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '|', '-', '|', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        print_board(g_board);
    }

    public static void print_board(char[][] g_board) {
        for (int r = 0; r < g_board.length; r++) {
            for (int c = 0; c < g_board[0].length; c++) {
                System.out.print(g_board[r][c]);
            }
            System.out.println();
        }
    }

    static void p_holder(char[][] g_board, int pos, String user) {
        char syb = 'x';
        if (user.equals("You")) {
            syb = 'x';
        } else if (user.equals("Comp")) {
            syb = '0';
        }
        switch (pos) {
            case 1:
                g_board[0][0] = syb;
                break;
            case 2:
                g_board[0][2] = syb;
                break;
            case 3:
                g_board[0][4] = syb;
                break;

            case 4:
                g_board[2][0] = syb;
                break;
            case 5:
                g_board[2][2] = syb;
                break;
            case 6:
                g_board[2][4] = syb;
                break;
            case 7:
                g_board[4][0] = syb;
                break;
            case 8:
                g_board[4][2] = syb;
                break;
            case 9:
                g_board[4][4] = syb;
                break;
            default:
                System.out.println("Invalid Input ");
        }
        print_board(g_board);
    }
}
