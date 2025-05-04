package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Input:
//nums = [3,4,5,6], target = 7
//
//Output: [0,1]
public class TwoSum {
    //returns the values
    public static int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int[] res = new int[2];
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            if(nums[l]+nums[r] < target) l++;
            else if(nums[l]+nums[r] == target){
                res[0] = nums[l];
                res[1] = nums[r];
            }
            r--;
        }
        return res;
    }
    //returns the index
    public static int[] twoSumWithIndex(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
            }else{
                map.put(nums[i], i);
                map.put(target - nums[i], i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = twoSum(new int[]{3, 4, 5, 6}, 7);
        System.out.println(Arrays.toString(res));

        int[] ans = twoSumWithIndex(new int[]{3, 4, 5, 6}, 7);

        System.out.println(Arrays.toString(ans));
    }
}
