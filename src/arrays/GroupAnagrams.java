package arrays;

import java.util.*;

//Input: strs = ["act","pots","tops","cat","stop","hat"]
//
//Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]

public class GroupAnagrams {
    //time complexity : O(m * nlogn)
    //Space complexity: O( m * n) because chars array's size depends on string length
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if(map.containsKey(sorted)){
                List<String> list = map.get(sorted);
                list.add(s);
                map.put(sorted, list);
            }else{
                List<String> val = new ArrayList<>();
                val.add(s);
                map.put(sorted, val);
            }
        }
        return map.values().stream().toList();
    }
    //time complexity : O(m * nlogn)
    //Space complexity: O(n) ch array has fixed size of 26
    public static List<List<String>> groupAnagramsSpaceOptimized(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] ch = new char[26];
            for(char c : s.toCharArray()){
                ch[c - 'a']++;
            }
            String key = Arrays.toString(ch);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }else{
                map.put(key, new ArrayList<>());
                map.get(key).add(s);
            }
        }

        return map.values().stream().toList();
    }

    public static void main(String[] args) {
        String[] input = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> res  =  groupAnagramsSpaceOptimized(input);
        System.out.println(res);
    }
}
