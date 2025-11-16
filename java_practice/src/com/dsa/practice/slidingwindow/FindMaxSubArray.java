package com.dsa.practice.slidingwindow;

public class FindMaxSubArray {


    public static void main(String[] args){

        System.out.println(findKSubArray(new int[] {3, 8, 7, 8, 7, 5}, 3));
    }

    public static int findKSubArray(int[] nums, int k){
        int maxCount = 0;
        int windowSum = 0;

        for(int i = 0; i < k; i++){
            windowSum += nums[i];
        }
        maxCount = windowSum;
        for(int i = k; i < nums.length; i++){
            windowSum += nums[i] - nums[i - k];

            if(windowSum > maxCount) maxCount = windowSum;
        }
        return maxCount;
    }
}
