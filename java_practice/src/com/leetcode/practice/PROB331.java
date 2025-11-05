package com.leetcode.practice;

import java.util.Arrays;

public class PROB331 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(findXSum(new int[]{3, 8, 7 ,8, 7, 5}, 3, 3)));

    }

    public static int[] findXSum(int[] nums, int k, int x) {

        int[] newNums = new int[10];

        if( k == x) {
            for(int i = 0; i < nums.length - k + 1; i++){

                int count = 0;
                int f = k;
                while(f > 0){
                    count += nums[i + f];
                    f--;
                }
                newNums[i] = count;
            }
        }

        return newNums;

    }
}
