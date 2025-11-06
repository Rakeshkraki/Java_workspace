package com.dsa.practice.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class FindFreq {

    public static void main(String[] args) {

        findFreqHash(new int[] { 1,2,3,4,5,6,5,4,3,2,1,3,2});
    }

    public static void findFreq(int[] nums){

        for(int i = 0; i < nums.length; i++){
            int count = 1;
            for(int j = i+1 ; j  < nums.length; j++){
                if(nums[i] == nums[j]) count += 1;
            }
            System.out.println(nums[i] + " --->" + count);
        }
    }

    public static void findFreqHash(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}
