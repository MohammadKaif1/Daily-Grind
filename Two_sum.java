import java.util.Arrays;
import java.util.Scanner;

public class Two_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order.
        Example-->>Input--[5,4,3,2];target=9;
                   Output--[0,1]
        */

        int n = in.nextInt(); //length of array
        int [] arr = new int[n];

        int target =  in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();


        }
        int ans []= TwoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }

     static int[] TwoSum(int[] nums, int target) {
         int n= target;
         int [] ans =new int[2];
         for(int i = 0;i<nums.length;i++)
         {
             for(int j=i+1;j<nums.length;j++)
             {
                 if(nums[i]+nums[j]==target)
                 {


                     ans[0]=i;
                     ans[1]=j;
                     return ans;

                 }

             }

         }
         return null;

    }
}
