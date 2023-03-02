package io.javabrains.javabasics;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int [] nums = {1,2,3,4,5,6,-1,-2,-6,10};

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        int sum  =0;
        int average  =0;
        int largest_num  = nums[0];
        for(int i : nums){
            sum = sum + i;
            largest_num = Math.max(largest_num,i);
        }
        average = sum/nums.length;
        System.out.println("sum is "+sum);
        System.out.println("average is "+average );
        System.out.println("largest number is "+largest_num);
    }
}
