package com.leetcode.practice;

import java.util.Arrays;

public class PROB331 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findXSum(new int[]{3, 8, 7 ,8, 7, 5}, 2, 2)));

    }

    public static int[] findXSum(int[] nums, int k, int x) {

        int[] newNums = new int[nums.length - 1];
        if( k == x) {
            for(int i = 0; i < nums.length - 1; i++){

                newNums[i] = nums[i] + nums[i+1];
            }
        }

        return newNums;

    }
}
