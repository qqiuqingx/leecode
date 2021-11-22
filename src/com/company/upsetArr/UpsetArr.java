package com.company.upsetArr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 给你一个整数数组 nums ，设计算法来打乱一个没有重复元素的数组。
 *
 * 实现 Solution class:
 *
 * Solution(int[] nums) 使用整数数组 nums 初始化对象
 * int[] reset() 重设数组到它的初始状态并返回
 * int[] shuffle() 返回数组随机打乱后的结果
 *

 */
public class UpsetArr {
    private final int[] defaultArr;
    public UpsetArr(int[] nums) {
        this.defaultArr=nums;
    }

    public int[] reset() {
        return defaultArr;
    }

    public int[] shuffle() {
        int[] a=new int[defaultArr.length];
        Random random = new Random();
        List<Integer> lis=new ArrayList<>();
        int length=0;
        while(lis.size()<defaultArr.length){
            int sa=random.nextInt(defaultArr.length);
            if (lis.contains(sa)){
                continue;
            }
            a[length]=defaultArr[sa];
            lis.add(sa);
            length++;
        }



        return a;
    }

}
