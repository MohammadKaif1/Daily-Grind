import java.util.Arrays;
import java.util.Scanner;

public class Running_sum_of_1d_array {
    public static void main(String[] args) {
        /*Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

            Return the running sum of nums.
            Example--->>Input-[1,2,3,4]
                        Output-[1,3,6,10]

            */
        Scanner in= new Scanner(System.in);
        int n = in.nextInt();
        int [] arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
            
            
        }
        int []ans = RunningSumOf1DArr(arr);
        System.out.println(Arrays.toString(ans));
    }

     static int[] RunningSumOf1DArr(int[]nums) {
         for (int i = 1; i < nums.length; i++) {

             nums[i]=nums[i]+nums[i-1];
             
         }
        return nums;
    }
}
