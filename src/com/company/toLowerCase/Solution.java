package com.company.toLowerCase;

/**
 * 转换成小写字母
 * 给你一个字符串 s ，将该字符串中的大写字母转换成相同的小写字母，返回新的字符串。
 */
class Solution {
    public static String toLowerCase(String s) {

        //A=65 Z=90  a=97 z=122
        StringBuilder sb=new StringBuilder();
        for ( int i=0;i<s.length();i++
        ){
            char c = s.charAt(i);
            if (c>='A'&&c<='Z'){
                sb.append((char)(c+32));
            }else
                sb.append(c);


        }
        return sb.toString();
    }

    public static void main(String[] args) {
        toLowerCase(
                "al&phaBET"
        );
    }
}