package com.codedifferently.problem02;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            Character current = input.charAt(i);
            if (map.containsKey(current)) {
                Integer value = map.get(current) + 1;
                map.put(current,value);
            } else {
                map.put(current,1);
            }
        }
        String result = "";
        for (Character value: map.keySet()) {
            result +=String.format("%s:%d ",value,map.get(value));
        }

        return result.trim();
    }
}
