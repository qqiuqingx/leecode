package com.company.dayOfYear;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * 一年中的第几天
 * 给你一个字符串 date ，按 YYYY-MM-DD 格式表示一个 现行公元纪年法 日期。请你计算并返回该日期是当年的第几天。
 *
 * 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。
 *

 */
public class dayOfYear {

    /**
     * 力扣中报错
     * @param date
     * @return
     */
    public static int dayOfYear(String date) {
        String[] split = date.split("-");
        LocalDate of = LocalDate.of(Integer.valueOf(split[0]), Integer.valueOf(split[1]), Integer.valueOf(split[2]));


        return of.getDayOfYear();
    }

    public static void main(String[] args) {
        System.out.println(dayOfYear("2003-03-01"));
    }


    public static int dayOfYear2(String date) {
        List<Integer> months1 = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        String[] split = date.split("-");

        int year= Integer.valueOf(split[0]);
        int month= Integer.valueOf(split[1]);
        int x=1;
        int day=0;
        while (x<month){
            if (x==2){
               day+= isS(year)?29:28;
            }else
            day+=months1.contains(x)?31:30;

            x++;
        }



            return day+Integer.valueOf(split[2]);
    }

    private static boolean isS(int year){

        return (year%400==0||(year%4==0&&year%100!=0));
    }




}
