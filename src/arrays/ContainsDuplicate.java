package arrays;

//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
//
//Example 1:
//
//Input: nums = [1, 2, 3, 3]
//
//Output: true

import java.util.*;

public class ContainsDuplicate {
    public static boolean hasDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int i : nums) {
//            if(set.contains(i)) return true;
//            else set.add(i);
//        }
//        return false;

        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        boolean res = hasDuplicate(nums);
        System.out.println(res);
    }
}
