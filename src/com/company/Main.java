/**
 * Created By Dineth Panditha
 * Date :2/27/2023
 * Time :3:05 PM
 * Project Name :snakeGame
 */
package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static HashSet<Integer> ur_set = new HashSet<Integer>();
    static HashSet<Integer> comp_set = new HashSet<Integer>();

    public static void main(String[] args) {

        char[][] g_board = {
                {' ', '|', ' ', '|', ' '},
                {'-', '|', '-', '|', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '|', '-', '|', '-'},
                {' ', '|', ' ', '|', ' '}
        };

        print_board(g_board);
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Values for 1 to 9 :");
            int user_pos = input.nextInt();

            while (ur_set.contains(user_pos) || comp_set.contains(user_pos)) {
                System.out.println();
                System.out.print("Retry,Enter Values for 1 to 9 :");
                int user_poss = input.nextInt();
            }
            p_holder(g_board, user_pos, "You");
            //----

            int cpu_pos = gen_random();
            while (ur_set.contains(cpu_pos) || comp_set.contains(cpu_pos)) {
                int cpu_poss = gen_random();
            }
            p_holder(g_board, cpu_pos, "Comp");
        }
    }

    static int gen_random() {
        int max = 9;
        int min = 1;
        int range = max - min + 1;
        int res = (int) (Math.random() * range) + min;
        return res;
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
            ur_set.add(pos);
        } else if (user.equals("Comp")) {
            syb = '0';
            comp_set.add(pos);
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
