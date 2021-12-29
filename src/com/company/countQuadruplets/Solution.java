package com.company.countQuadruplets;

/**
 *  统计特殊四元组
 * 给你一个 下标从 0 开始 的整数数组 nums ，返回满足下述条件的 不同 四元组 (a, b, c, d) 的 数目 ：
 *
 * nums[a] + nums[b] + nums[c] == nums[d] ，且
 * a < b < c < d
 *

 */
class Solution {
    public static int countQuadruplets(int[] nums) {
        int a=0;
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i+1; i1 < nums.length; i1++) {
                for (int i2 = i1+1; i2 < nums.length; i2++) {
                    for (int i3 = i2+1; i3 < nums.length; i3++) {
                        if (nums[i]+nums[i1]+nums[i2]==nums[i3]){
                            a++;
                        }
                    }
                }
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int i = countQuadruplets(new int[]{1, 1, 1, 3, 5});
        System.out.println(i);
    }
}