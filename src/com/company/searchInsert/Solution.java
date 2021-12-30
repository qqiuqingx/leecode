package com.company.searchInsert;

/**
 * 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *

 */
class Solution {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=target){
                return i;
            }
        }


        return nums.length;
    }

    public static void main(String[] args) {
        int i = searchInsert(new int[]{1, 3, 5, 6}, 3);
        System.out.println(i);
    }
}