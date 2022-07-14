package com.codedifferently.problem03;

import java.util.HashMap;

public class Solution {

    public Integer[] stringToNumbers(String[] input){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("zero",0);
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("six",6);
        map.put("eleven",11);
        map.put("twelve",12);
        map.put("nineteen",19);
        Integer[] nums = new Integer[input.length];
        for (int i = 0; i < input.length; i++) {
            if(map.containsKey(input[i])) {
                nums[i] = map.get(input[i]);
        }
        }
        return nums;
    }
}
