package com.company.kthSmallestPrimeFraction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 给你一个按递增顺序排序的数组 arr 和一个整数 k 。数组 arr 由 1 和若干 素数  组成，且其中所有整数互不相同。
 *
 * 对于每对满足 0 < i < j < arr.length 的 i 和 j ，可以得到分数 arr[i] / arr[j] 。
 *
 * 那么第 k 个最小的分数是多少呢?  以长度为 2 的整数数组返回你的答案, 这里 answer[0] == arr[i] 且 answer[1] == arr[j] 。



 记录每一个分数 并且按照升序排序

 用：

 a×d<b×c
 来替代
 a/b​<c/d
 ​

 */
public class Solution {

    public static int[] kthSmallestPrimeFraction(int[] arr, int k) {

        List<int[]> sk=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int s=i+1;s<arr.length;s++){
                sk.add(new int[]{arr[i],arr[s]});
            }
        }
        sk.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]*o2[1]-o2[0]*o1[1];
            }
        });
        return sk.get(k-1);
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5};
        List<int[]> ints = Arrays.asList(kthSmallestPrimeFraction(arr, 3));
        System.out.println();
    }

}
