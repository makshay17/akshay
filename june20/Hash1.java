package main.java.june20;

import java.util.*;


public class Hash1 extends Throwable {
    public static void main(String[] args) throws Hash1 {
        Map<String, Student> abc = new HashMap<>();
        abc.put("Krishna", new Student("Krishna", "Vishnu", 4));
        abc.put("Pk", new Student("pk", "Venkat", 4));
        abc.put("nagesh", new Student("nagesh", "Vam", 3));

        for (Map.Entry<String, Student> entry : abc.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue().getGpa());
        }
        //for each
        abc.forEach((mm,k)->System.out.println(mm+k.getGpa()));
        //Key Set
        Iterator<String> sse = abc.keySet().iterator();
        while (sse.hasNext()) {
            String s1=sse.next();
            System.out.println(sse.next()+abc.get(s1).getGpa());
            
        }
        //Question 2

        String input = "test string";

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            System.out.println(character + ":" + count);
        }
        //Question 3
        int [] nums= new int[]{1,2,3,4,5};
        int target=4;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println(map.get(complement)+ " "+i);
            }
            map.put(nums[i], i);
        }


    }
}