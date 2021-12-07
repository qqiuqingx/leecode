package com.company.reverseStr;

/**
 *  反转字符串 II
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 *
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 *

 */
public class Solution {
    public static String reverseStr(String s, int k) {
        int length = s.length();
        int index=0;
        StringBuilder sb=new StringBuilder();
        while (index<length){
            int end = Math.min(index+k, length);
            StringBuilder substring =new StringBuilder( s.substring(index, end));
            if ((index/k)%2==0){
                sb.append(substring.reverse());
            }else sb.append(substring);
            index=end;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseStr("abcd",2));
        StringBuilder res = new StringBuilder("abc");
        System.out.println(res.reverse());
    }
}
