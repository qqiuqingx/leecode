package com.company.frequencySort;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencySort {
    public static void main(String[] args) {
        FrequencySort frequencySort = new FrequencySort();
        frequencySort.frequencySort(new int[]{11,2,2,2,6,6,7});
    }
    public int[] frequencySort(int[] nums) {
           Map<Integer,Integer> m=new HashMap<>();
        for (int num : nums) {
            m.put(num,m.getOrDefault(num,0)+1);
        }
        // 对频率排序
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
        list.addAll(m.entrySet());
//        Collections.sort(list, (a, b)->{
//            if (a.getValue() == b.getValue()) {
//                // 多个值的频率相同，按照数值本身将它们降序排序
//                return b.getKey() - a.getKey();
//            } else {
//                // 按照每个值的频率升序排序
//                return a.getValue() - b.getValue();
//            }
//        });
        List<Map.Entry<Integer, Integer>> collect =
                list.stream().
                        sorted(Comparator.comparingInt(s -> s.getValue())).collect(Collectors.toList());


        return new int[3];
    }
}
