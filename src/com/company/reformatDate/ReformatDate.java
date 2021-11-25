package com.company.reformatDate;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 给你一个字符串 date ，它的格式为 Day Month Year ，其中：
 *
 * Day 是集合 {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"} 中的一个元素。
 * Month 是集合 {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"} 中的一个元素。
 * Year 的范围在 ​[1900, 2100] 之间。
 * 请你将字符串转变为 YYYY-MM-DD 的格式，其中：
 *
 */
public class ReformatDate {
    static Map<String,String> map=new HashMap<>();
    public static String reformatDate(String date) {
        String[] split = date.split(" ");
        map.put("Jan","01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("Sep","09");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");


        StringBuilder a= new StringBuilder();
        String day = split[0];
        for (int i=0;i<day.length();i++){
            char c = day.charAt(i);
            if (c>47&&c<58){
                a.append(c);
            }
        }

        return split[2]+"-"+map.get(split[1])+"-"+(Integer.parseInt(a.toString())<10?"0"+a.toString():a);
    }

    public static void main(String[] args) {
        System.out.println(        reformatDate("2nd Apr 2023"));
    }

}
