package com.company.validTicTacToe;

/**
 * 有效的井字游戏
 * 给你一个字符串数组 board 表示井字游戏的棋盘。当且仅当在井字游戏过程中，棋盘有可能达到 board 所显示的状态时，才返回 true 。
 *
 * 井字游戏的棋盘是一个 3 x 3 数组，由字符 ' '，'X' 和 'O' 组成。字符 ' ' 代表一个空位。
 *
 * 以下是井字游戏的规则：
 *
 * 玩家轮流将字符放入空位（' '）中。
 * 玩家 1 总是放字符 'X' ，而玩家 2 总是放字符 'O' 。
 * 'X' 和 'O' 只允许放置在空位中，不允许对已放有字符的位置进行填充。
 * 当有 3 个相同（且非空）的字符填充任何行、列或对角线时，游戏结束。
 * 当所有位置非空时，也算为游戏结束。
 * 如果游戏结束，玩家不允许再放置字符。
 *
 */
public class Solution {
    public static boolean validTicTacToe(String[] board) {
        int x_c=0,y_c=0;
        for (int i = 0; i < board.length; i++) {
                String str=board[i];
            for (int k=0;k<str.length();k++){
                char c = str.charAt(k);
                if (c=='X'){
                    x_c++;
                }else {
                    y_c++;
                }
            }
        }
        if (x_c!=y_c&&y_c!=x_c-1){
            return false;
        }
        if (win(board, 'X') && y_c != x_c - 1) {
            return false;
        }
        if (win(board, 'O') && y_c != x_c) {
            return false;
        }

        return false;
    }

    /**
     * 判断x或o横，竖，相差是否链接
     * @param board
     * @param p
     * @return
     */
    public static boolean win(String[] board, char p) {
        for (int i = 0; i < 3; ++i) {
            if (p == board[0].charAt(i) && p == board[1].charAt(i) && p == board[2].charAt(i)) {
                return true;
            }
            if (p == board[i].charAt(0) && p == board[i].charAt(1) && p == board[i].charAt(2)) {
                return true;
            }
        }
        if (p == board[0].charAt(0) && p == board[1].charAt(1) && p == board[2].charAt(2)) {
            return true;
        }
        if (p == board[0].charAt(2) && p == board[1].charAt(1) && p == board[2].charAt(0)) {
            return true;
        }
        return false;
    }


}
