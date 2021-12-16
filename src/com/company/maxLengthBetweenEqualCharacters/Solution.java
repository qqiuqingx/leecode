package com.company.maxLengthBetweenEqualCharacters;

import java.util.HashMap;
import java.util.Map;

/**
 * 两个相同字符之间的最长子字符串
 * 给你一个字符串 s，请你返回 两个相同字符之间的最长子字符串的长度 ，计算长度时不含这两个字符。如果不存在这样的子字符串，返回 -1 。
 *
 * 子字符串 是字符串中的一个连续字符序列。

 */
class Solution {



    public static int maxLengthBetweenEqualCharacters(String s) {

        Map<Character,Integer> ap=new HashMap<>();
        int a=-1;
        for (int i = 0; i < s.length(); i++)
        {
            Character c = s.charAt(i);
            Integer integer = ap.get(c);
            if (integer!=null){
                Integer integer1 = i -ap.get( c )- 1;
                a=Math.max(integer1,a);
            }else {
                ap.put(c,i);
            }
           // ap.put(c,i-(ap.getOrDefault(c,0)-1));

        }


        return a;
    }

    public static void main(String[] args) {
        maxLengthBetweenEqualCharacters("cabbac");
    }
}