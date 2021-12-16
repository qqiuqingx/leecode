package com.company.frequencySort2;

import com.sun.deploy.util.ArrayUtil;

import java.util.*;

/**
 *
 *
 * 按照频率将数组升序排序
 * 给你一个整数数组 nums ，请你将数组按照每个值的频率 升序 排序。如果有多个值的频率相同，请你按照数值本身将它们 降序 排序。
 *
 * 请你返回排序后的数组。
 */
public class Solution {
    public static int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> lis=new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            lis.add(nums[i]);
            map.put(nums[i],(map.getOrDefault(nums[i],0))+1);
        }
        lis.sort((a,b)->{
            int integer = map.get(a);
            int integer1 = map.get(b);
            if (integer==integer1) return b-a;

            return integer-integer1;
        });



        return lis.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] ints = frequencySort(new int[]{2,3,1,3,2});
        System.out.println(ints);
    }

}
