package com.company.findRelativeRanks;

import java.util.*;

/**相对名次
 * 给你一个长度为 n 的整数数组 score ，其中 score[i] 是第 i 位运动员在比赛中的得分。所有得分都 互不相同 。
 *
 * 运动员将根据得分 决定名次 ，其中名次第 1 的运动员得分最高，名次第 2 的运动员得分第 2 高，依此类推。运动员的名次决定了他们的获奖情况：
 *
 * 名次第 1 的运动员获金牌 "Gold Medal" 。
 * 名次第 2 的运动员获银牌 "Silver Medal" 。
 * 名次第 3 的运动员获铜牌 "Bronze Medal" 。
 * 从名次第 4 到第 n 的运动员，只能获得他们的名次编号（即，名次第 x 的运动员获得编号 "x"）。
 * 使用长度为 n 的数组 answer 返回获奖，其中 answer[i] 是第 i 位运动员的获奖情况。
 *

 */
public class Solution {
    /**
     * 先排序后再找出原始数组每一个的名次的下标
     * @param score
     * @return
     */
    public static String[] findRelativeRanks(int[] score) {
        int[] ints = Arrays.copyOf(score, score.length);
        List<String> list=new ArrayList<>();


        for (int i = 0; i < score.length; i++) {
            for (int k=i+1;k<score.length;k++){
                if (ints[i]<ints[k]){
                    int  n=ints[i];
                    ints[i]=ints[k];
                    ints[k]=n;
                }
            }
        }

        for (int i = 0; i < score.length; i++) {
            for (int i1 = 0; i1 < ints.length; i1++) {
                if (ints[i1]==score[i]){
                    System.out.println(i+"："+i1);
                    if (i1==0){
                        list.add("Gold Medal");
                    }
                    else if (i1==1) {
                        list.add("Silver Medal");
                    }
                    else if (i1==2){
                        list.add("Bronze Medal");
                    }
                    else {
                        list.add(String.valueOf(i1+1));
                    }


                        break;
                }
            }
        }



        String[] array =new String[list.size()];

        list.toArray(array);

        return array;
    }
    public String[] findRelativeRanks2(int[] score) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<score.length; ++i) map.put(score[i], i);//记录值和下标
        Arrays.sort(score);//升序排序
        String[] ans = new String[score.length];
        for (int i=0; i<score.length; ++i){
            int s = map.get(score[i]);//获取排序后的第i个值之前的下标
            if (score.length-i==1) ans[s] = "Gold Medal";
            else if (score.length-i==2) ans[s] = "Silver Medal";
            else if (score.length-i==3) ans[s] = "Bronze Medal";
            else ans[s] = String.valueOf(score.length-i);//
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] relativeRanks = findRelativeRanks(new int[]{10,3,8,9,4});
        System.out.println( );
    }
}
