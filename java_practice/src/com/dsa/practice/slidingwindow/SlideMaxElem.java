package com.dsa.practice.slidingwindow;

import java.lang.reflect.Array;
import java.util.Arrays;

class SlideMaxElem {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if( k == 1 && nums.length == 1){
            return new int[] {1};
        }
        int[] output = new int[nums.length - k + 1];
        int maxElem = nums[0];

        for(int i = 0; i < nums.length - k + 1; i++){
            maxElem = Math.max(Math.max(maxElem, nums[i+1]), nums[i+2]);
            output[i] = maxElem;
        }
        return output;
    }

    public static void main(String[] args) {
        SlideMaxElem obj = new SlideMaxElem();
        //System.out.println(Arrays.toString(obj.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7},3 )));
        System.out.println(Arrays.toString(obj.maxSlidingWindow(new int[] {1,3,-1,-3,5,3,6,7},2 )));
    }
}


//[1,3,-1,-3,5,3,6,7], k = 3