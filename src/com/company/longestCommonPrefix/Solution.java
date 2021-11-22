package com.company.longestCommonPrefix;

public class Solution {

    /**
     * 编写一个函数来查找字符串数组中的最长公共前缀。
     *
     * 如果不存在公共前缀，返回空字符串 ""。
     *
     *
     * 先默认一个公共前缀 ，循环求出第i个与之前求出的公共前缀的共同前缀
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        String str=strs[0];//默认共同前缀为数组第一个
        for (int i = 1; i < strs.length; i++) {
            str= set(strs[i],str);
        }
        return str;

    }

    private String set(String str, String str2){
        StringBuilder stringBuilder = new StringBuilder("");
        char[] chars = str.toCharArray();
        char[] chars1 = str2.toCharArray();
        for (int i=0;i<Math.max(chars1.length,chars.length);i++){
            String a=i<chars.length?String.valueOf(chars[i]):"";
            String b=i<chars1.length?String.valueOf(chars1[i]):"";
            if (!a.equals(b)){//如果不相等 则没有公共前缀了
                return stringBuilder.toString();
            }
            stringBuilder.append(a);
        }
        return stringBuilder.toString();//每次返回
    }

}
