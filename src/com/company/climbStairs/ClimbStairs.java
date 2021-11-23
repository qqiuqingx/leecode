package com.company.climbStairs;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        if (n==1) return 1;
        if (n==2) return 2;
        int a,b=2,c=3;
        for (int i=3;i<n;i++){
            a=b;
            b=c;
            c=a+b;
        }
        return c;
    }
}
