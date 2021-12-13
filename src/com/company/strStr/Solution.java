package com.company.strStr;


/**
 * 实现 strStr() 函数。
 *
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 *
 *  
 *
 * 说明：
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。
 */
public class Solution {


    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) return 0;
        if (needle.length()>haystack.length()) return -1;
        int a=0;
        int b=0;
        int c =-1;
        while (a<haystack.length()&&b<needle.length()){
            if (haystack.charAt(a)==needle.charAt(b)){
                if (c==-1){
                    c=a;
                }
                b++;
            }else {
                if (
                        c!=-1
                ){
                    a=c;
                    b=0;
                }
                c=-1;

            }
            a++;
        }

        return b==needle.length()?c:-1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi","issip"));
    }

}
