package com.company.hasAlternatingBits;


/**
 *
 * 交替位二进制数
 * 给定一个正整数，检查它的二进制表示是否总是 0、1 交替出现：换句话说，就是二进制表示中相邻两位的数字永不相同。
 */
class Solution {
    /**
     * 将数字转为二进制字符串再相互之间比较
     * @param n
     * @return
     */
    public static boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);

        for (int i=1;i<s.length();i++){
            if (s.charAt(i)==s.charAt(i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean b = hasAlternatingBits(5);
        System.out.println(b);
    }
}