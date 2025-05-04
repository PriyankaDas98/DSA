package arrays;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopKFrequentElement {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }
        List<Integer> res = map.entrySet().stream()
                .sorted((a,b)->b.getValue()-a.getValue())
                .map(Map.Entry::getKey)
                .limit(k)
                .toList();

        return res;
    }
    public static void main(String[] args) {
        int[] input = {1,2,2,3,3,3};
        int k = 2;
//        int[] res = topKFrequent(input, k);
        List<Integer> res = topKFrequent(input, k);
        System.out.println(res);
    }
}
