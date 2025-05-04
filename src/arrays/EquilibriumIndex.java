package arrays;

import java.util.Arrays;

public class EquilibriumIndex {
    public static int pivotIndex(int[] nums) {
            int[] prefixSum = new int[nums.length];
            int j = 1;
            for(int i=0; i<nums.length-1;i++){
                prefixSum[j] = prefixSum[j-1]+nums[i];
                j++;
            }
            System.out.println(Arrays.toString(prefixSum));
            for(int i=0; i < nums.length; i++){
                int sum = 0;
                for(int k = i+1; k<nums.length; k++){
                    sum += nums[k];
                }
                if(sum==prefixSum[i]) return i;
            }
            return -1;
        }

    public static void main(String[] args) {
        int res = pivotIndex(new int[]{1,7,3,6,5,6});
        System.out.println(res);
    }
}
