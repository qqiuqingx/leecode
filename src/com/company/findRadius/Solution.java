package com.company.findRadius;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 供暖器
 * 冬季已经来临。 你的任务是设计一个有固定加热半径的供暖器向所有房屋供暖。
 *
 * 在加热器的加热半径范围内的每个房屋都可以获得供暖。
 *
 * 现在，给出位于一条水平线上的房屋 houses 和供暖器 heaters 的位置，请你找出并返回可以覆盖所有房屋的最小加热半径。
 *
 * 说明：所有供暖器都遵循你的半径标准，加热的半径也一样。
 *

 */
class Solution {
    /**
     * 找house离得最近得heater（最近的半径） 再取出最远的
     * @param houses
     * @param heaters
     * @return
     */
    public static int findRadius(int[] houses, int[] heaters) {
        List<Integer> integers=new ArrayList<>();
        for (int house : houses) {
            int a=-1;

            for (int heater : heaters) {
                int abs = Math.abs(house - heater);
                if (a==-1){
                    a=abs;
                }else if (a>abs){
                    a=abs;
                }


            }

            integers.add(a);

        }


        return integers.stream().sorted(Comparator.comparingInt(Integer::intValue).reversed()).findFirst().get();
    }

    public static void main(String[] args) {
        int radius = findRadius(new int[]{1,5}, new int[]{2});

    }
}