import java.util.Arrays;
import java.util.Scanner;

public class Concatenation_of_array {
    public static void main(String[] args) {
       /* Given an integer array nums of length n, you want to
       create an array ans of length 2n where,
        ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

        Specifically, ans is the concatenation of two nums arrays.

        Return the array ans.
        Example-
        Input -->>[4,6,8]
        Output-->>[4,6,8,4,6,8] //here size of array is 2 times the size of the above array

        */
        //First we need a Array of any length
        Scanner in = new Scanner (System.in); //this is scanner class used to take input from user .
        System.out.print("Enter the length of array: ");
        int n= in.nextInt();
        System.out.println("Enter "+n+" elements");
        int [] arr = new int[n];
//using for loop for taking input in array

        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt(); //takes the input from user n times.
        }
        int []ans = Getconcatenated(arr);
        /*calling the function ,since we are returning array
        in this function so we have to put this in a different variable to print the output*/
        System.out.println("Concatenated Array :"+Arrays.toString(ans));



    }

     static int[] Getconcatenated(int [] nums) {
        int n=nums.length;
        int ans []= new int[2*n];//ans is double the size of nums array
         //using for loop for taking every nums index value in ans index
         for (int i = 0; i < nums.length; i++) {
             ans[i]=nums[i];
             ans[i+n]= nums[i];
         }

        return ans;
    }
}
