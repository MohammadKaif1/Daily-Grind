import java.util.Arrays;
import java.util.Scanner;

public class Array_from_permutation {
    public static void main(String[] args) {
        /*Given a zero-based permutation nums (0-indexed),
        build an array ans of the same length where ans[i] = nums[nums[i]]
        for each 0 <= i < nums.length and return it.

        A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).*/
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array:");
        int n = in.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the numbers in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= in.nextInt();

        }
        int ans[]= permutation(arr);
        System.out.println(Arrays.toString(ans));
    }

     static int[] permutation(int[] nums) {
        int []ans= new int[nums.length];
         for (int i = 0; i < nums.length; i++) {
             ans[i]=nums[nums[i]];
         }
         return ans;
    }
}
