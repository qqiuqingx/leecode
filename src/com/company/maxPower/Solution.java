package com.company.maxPower;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 连续字符
 * 给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
 *
 * 请你返回字符串的能量。
 * 输入：s = "leetcode"
 * 输出：2
 * 解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
 */
public class Solution {

    /**
     * 记录每个字符出现的次数，当出现次数比ax大时更新ax
     * @param s
     * @return
     */
    public static int maxPower(String s) {
        int max=1,ax=1;

        for (int i=1;i<s.length();i++){
            if (s.charAt(i)==s.charAt(i-1)){
                max++;
            }else {
                max=1;
            }
            if (max>ax){
                ax=max;
            }
        }

        return  ax;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("asodas"));
    }

}
