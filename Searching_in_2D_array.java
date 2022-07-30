import java.util.Arrays;
import java.util.Scanner;

public class Searching_in_2D_array {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int target = in.nextInt();
        int [][]arr = {
                        {23,45,66,77,48},
                        {77,43,31},
                        {68,79,44,87},
                        {91,42,83,94,1010}
                    };
        int ans[] =  Search(arr,target);
        System.out.println(Arrays.toString(ans));

    }

     static int[] Search(int[][] arr, int target) {
         for (int row    = 0; row <arr.length ; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                 if(arr[row][col]==target)
                 {
                     return new int [] {row,col};
                 }

             }

         }
         return new int []{-1,-1};
    }
}
