package com.company.buddyStrings;

/**
 * 给你两个字符串 s 和 goal ，只要我们可以通过交换 s 中的两个字母得到与 goal 相等的结果，就返回 true ；否则返回 false 。
 *
 * 交换字母的定义是：取两个下标 i 和 j （下标从 0 开始）且满足 i != j ，接着交换 s[i] 和 s[j] 处的字符。
 *
 * 例如，在 "abcd" 中交换下标 0 和下标 2 的元素可以生成 "cbad" 。
 *

 */
public class BuddyStrings {
    private boolean buddyStrings(String s, String goal){
        if (s.length()!= goal.length()) return false;
        int f=-1,sr=-1;
        int [] asd=new int[26];
        int [] asd1=new int[26];
        int sum=0;
        for (int i=0;i<s.length();i++){
            f=s.charAt(i)-'a';
            sr=goal.charAt(i)-'a';
            asd[f]++;
            asd1[sr]++;
            if (f!=sr) sum++;
        }
        boolean sd=false;
        for (int i=0;i<asd.length;i++){
            if (asd[i] != asd1[i]) return false;
            if (asd[i]>1) sd=true;

        }
        return sum==2||(sum==0&&sd);
    }


    private boolean buddyStrings2(String s, String goal){
        if (s.length()!= goal.length()) return false;
        char[] chars = s.toCharArray();
        char[] chars1=s.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            for (int k =i+1;k<chars.length;k++){
                char a=chars1[i];
                chars1[i]=chars1[k];
                chars1[k]=a;
                if (String.valueOf(chars1).equals(goal)){
                    return true;
                }else {
                    //chars1=s.toCharArray();
                    chars1[k]=chars1[i];
                    chars1[i]=a;
                }
            }
        }
        return false;
    }


}
