import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        /*Given a 1D array and a target element.
         You have to search the index of target element*/
        Scanner in = new Scanner(System.in);

        int target=63;
        int []arr = {41,23,56,67,88,91,46,31,63,78};

        int result = searching(arr,target);
        System.out.println(result);
    }
    //we will make a function that will return the index of target element
    static int searching(int []nums,int target){

        for (int index = 0; index < nums.length; index++) {
             int element = nums[index];
            if(element==target)
            {
                return index;
            }

        }
        return -1;
    }
}
