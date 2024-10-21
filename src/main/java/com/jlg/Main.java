package com.jlg;

import java.util.HashMap;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] arr = { 4, 2, 5, 3, 2, 1, 3, 2, 2, 1, 0, 9, 9, 3 };
        int target = 12;

        int[] arr2 = {3, 2, 4};
        int target2 = 6;

        int[] arr3 = {1};
        int target3 = '1';

        String result1 = challengeSolution1(arr2, target2);
        String result2 = challengeSolution2(arr3, target3);
        String result3 = challengeSolution3(arr3, target3);

        System.out.println("The result 1: " + result1);
        System.out.println("The result 2: " + result2);
        System.out.println("The result 3: " + result3);
    }

    public static String challengeSolution1(int[] nums, int target) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
              if(nums[i] + nums[j] == target){
                  return "First index " + i + " Second index " + j;
              }
            }
        }

        return "Nothing is found!";
    }

    // ==================================================================
    // ============= NEW SOLUTIONS ADDED POST-INTERVIEW =================
    // ==================================================================

    // SOLUTION 2: Using Array Streams (I'm using Streams because I think they're
    // really powerful and I want to master them)

    public static String challengeSolution2(int[] nums, int target){
        return IntStream.range(0, nums.length)
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, nums.length)
                        .filter(j -> nums[i] + nums[j] == target)
                        .mapToObj(j -> "First index " + i + " Second index " + j)
                )
                .findFirst()
                .orElse("Nothing is found!");
    }


    // SOLUTION 3: The HashMap solution. I used HashMap for another challenge before
    // and I found them very interesting data structures

    public static String challengeSolution3(int[] nums, int target){
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            if (numMap.containsKey(temp)) {
                return "First index " + numMap.get(temp) + " Second index " + i;
            }
            numMap.put(nums[i], i);
        }
        return "Nothing is found!";
    }
}