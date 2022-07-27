import java.util.Arrays;
import java.util.Scanner;

public class Reversing_array {
    public static void main(String[] args) {
        /*Q-->To reverse an array using two pointer method*/
        Scanner in = new Scanner(System.in);


        int arr[]= new int[7];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        reverse(arr,0,6);
        System.out.println(Arrays.toString(arr));




    }

     static void reverse(int[] nums, int start, int end) {
        while(start<end)
        {

            swap(nums,start,end);
            start++;
            end--;
        }

    }

    static void swap (int [] nums ,int index1,int index2){
        int temp = nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}
